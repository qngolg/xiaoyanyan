package com.qngolg.xiaoyanyan.repository.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "user")
@Data
public class UserPo {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthDay;
}
