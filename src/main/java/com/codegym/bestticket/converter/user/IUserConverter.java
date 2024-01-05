package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.user.UserDto;
import com.codegym.bestticket.entity.user.User;

import java.util.List;

public interface IUserConverter {
    UserDto entityToDto(User user);

    User dtoToEntity(UserDto userDto);

    List<UserDto> entitiesToDtos(List<User> users);
}
