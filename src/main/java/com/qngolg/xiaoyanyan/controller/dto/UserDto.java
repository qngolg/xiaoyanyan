package com.qngolg.xiaoyanyan.controller.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String name;
    private String age;
    private LocalDate birthDay;
}
