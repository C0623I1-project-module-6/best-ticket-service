package com.codegym.bestticket.validation.validator;

import com.codegym.bestticket.repository.user.IOrganizerRepository;
import com.codegym.bestticket.validation.UniqueOrganizer;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UniqueOrganizerValidator implements ConstraintValidator<UniqueOrganizer, String> {
    private final IOrganizerRepository organizerRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return !organizerRepository.existsByPhoneNumber(value)
                && !organizerRepository.existsByEmail(value)
                && !organizerRepository.existsByTaxCode(value)
                && !organizerRepository.existsByBusinessCode(value);
    }
}
