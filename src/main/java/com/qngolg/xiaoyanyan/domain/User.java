package com.qngolg.xiaoyanyan.domain;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@Accessors(chain = true) // set方法返回this,可以一直.set
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String name;
    private int age;
    private LocalDate birthDay;
}
