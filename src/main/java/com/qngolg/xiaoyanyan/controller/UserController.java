package com.qngolg.xiaoyanyan.controller;

import com.qngolg.xiaoyanyan.controller.dto.UserDto;
import com.qngolg.xiaoyanyan.controller.mapper.UserMapper;
import com.qngolg.xiaoyanyan.service.UserAppService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {
    private final UserAppService userAppService;

    @SneakyThrows
    @GetMapping(value = "/{id}")
    public Mono<UserDto> findUsers(@PathVariable("id") Long id) {
        return Mono.justOrEmpty(userAppService.findById(id)).map(UserMapper.MAPPER::toDto);
    }
}
