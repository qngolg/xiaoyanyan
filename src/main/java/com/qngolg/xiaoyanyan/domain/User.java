package com.qngolg.xiaoyanyan.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private long id;
    private String name;
    private int age;
    private LocalDate birthDay;
}
