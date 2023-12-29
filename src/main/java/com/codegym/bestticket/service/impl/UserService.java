package com.codegym.bestticket.service.impl;

import com.codegym.bestticket.dto.ResponseDto;
import com.codegym.bestticket.dto.request.user.RegisterDtoRequest;
import com.codegym.bestticket.dto.request.user.LoginDtoRequest;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.repository.IUserRepository;
import com.codegym.bestticket.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements IUserService {
    private final IUserRepository iUserRepository;

    @Override
    public ResponseDto register(RegisterDtoRequest registerDtoRequest) {
        User user = new User();
        BeanUtils.copyProperties(registerDtoRequest, user);
        iUserRepository.save(user);
        return new ResponseDto(user);
    }

    @Override
    public ResponseDto login(LoginDtoRequest loginDtoRequest) {
        String password = loginDtoRequest.getPassword();
        if (password != null) {
            User user = iUserRepository.findByPhoneNumber(loginDtoRequest.getPhoneNumber());
            System.out.println(user);
            if (user != null) {
                if (password.equals(user.getPassword())) {
                   BeanUtils.copyProperties(loginDtoRequest, user);
                   iUserRepository.save(user);
                   return new ResponseDto(user);
                }
            }
        }
        return new ResponseDto();
    }
}


