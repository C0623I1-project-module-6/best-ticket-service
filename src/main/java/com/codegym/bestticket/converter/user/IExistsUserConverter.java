package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.payload.response.user.ExistsUserResponse;

public interface IExistsUserConverter {
    ExistsUserResponse mapToExistsUsers(User user);
}
