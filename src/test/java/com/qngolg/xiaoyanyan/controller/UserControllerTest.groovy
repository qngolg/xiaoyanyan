package com.qngolg.xiaoyanyan.controller

import com.qngolg.xiaoyanyan.repository.po.UserPo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Profile
import org.springframework.test.web.reactive.server.WebTestClient
import spock.lang.Specification

import javax.persistence.EntityManager
import java.time.LocalDate


@Profile("test")
@SpringBootTest
class UserControllerTest extends Specification {
    @Autowired
    WebTestClient webTestClient

    @Autowired
    TestEntityManager entityManager

    void "should get a user"(){
        given:
        def userPo = UserPo.builder().id(2).name("peiqi").age(1).birthDay(LocalDate.now()).build()
        entityManager.persist(userPo)

        when:
        def result = webTestClient.get().uri("/user/2").exchange()

        then:
        result.expectStatus().isOk()
    }
}
