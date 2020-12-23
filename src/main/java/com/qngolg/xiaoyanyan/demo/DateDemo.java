package com.qngolg.xiaoyanyan.demo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateDemo {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.toString());
        System.out.println(instant.toString());
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.toString());
    }
}
