package com.qngolg.xiaoyanyan.repository.po;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserPo {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthDay;
}
