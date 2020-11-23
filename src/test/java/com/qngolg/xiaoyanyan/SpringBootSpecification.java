package com.qngolg.xiaoyanyan;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;
import spock.lang.Specification;

@Profile("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootSpecification extends Specification {
}
