package com.qngolg.xiaoyanyan.controller;

import com.qngolg.xiaoyanyan.controller.dto.UserDto;
import com.qngolg.xiaoyanyan.controller.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

@RestController
public class UploadFileController {

    @PostMapping(value = "/upload")
    public Mono<Void> findUsers(@RequestParam(value = "file") MultipartFile file) {
        System.out.println(file.getName());
        return Mono.empty();
    }
}
