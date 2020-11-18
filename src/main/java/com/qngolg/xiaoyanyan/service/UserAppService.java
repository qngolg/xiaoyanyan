package com.qngolg.xiaoyanyan.service;

import com.qngolg.xiaoyanyan.controller.mapper.UserMapper;
import com.qngolg.xiaoyanyan.domain.User;
import com.qngolg.xiaoyanyan.repository.UserRepository;
import com.qngolg.xiaoyanyan.repository.po.UserPo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserAppService {

    private final UserRepository userRepository;

    public User findById(Long id) {
        Optional<UserPo> userPo = userRepository.findById(id);
        return userPo.map(UserMapper.MAPPER::toDomain).orElse(null);
    }
}
