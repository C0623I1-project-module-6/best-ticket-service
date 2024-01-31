package com.codegym.bestticket.validation.validator;

import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.validation.UniqueCustomer;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UniqueCustomerValidator implements ConstraintValidator<UniqueCustomer, String> {
    private final ICustomerRepository customerRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return !customerRepository.existsByPhoneNumber(value)
                && !customerRepository.existsByIdCard(value);
    }
}
