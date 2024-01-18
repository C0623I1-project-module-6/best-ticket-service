package com.codegym.bestticket.validation.validator;

import com.codegym.bestticket.repository.user.IUserRepository;
import com.codegym.bestticket.validation.UniqueUser;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UniqueUserValidator implements ConstraintValidator<UniqueUser,String> {
    private final IUserRepository userRepository;
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value== null){
            return true;
        }
        return !userRepository.existsByEmail(value)
                &&!userRepository.existsByUsername(value);
    }
}
