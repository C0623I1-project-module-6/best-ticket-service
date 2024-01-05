package com.codegym.bestticket.converter.user.impl;

import com.codegym.bestticket.converter.user.IUserConverter;
import com.codegym.bestticket.dto.user.UserDto;
import com.codegym.bestticket.entity.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserConverter implements IUserConverter {
    @Override
    public UserDto entityToDto(User user) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    @Override
    public User dtoToEntity(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return user;
    }

    @Override
    public List<UserDto> entitiesToDtos(List<User> users) {
        return users.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
