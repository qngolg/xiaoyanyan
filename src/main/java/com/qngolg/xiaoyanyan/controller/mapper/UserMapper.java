package com.qngolg.xiaoyanyan.controller.mapper;

import com.qngolg.xiaoyanyan.controller.dto.UserDto;
import com.qngolg.xiaoyanyan.domain.User;
import com.qngolg.xiaoyanyan.repository.po.UserPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    UserDto toDto(User user);

    User toDomain(UserPo userPo);
}
