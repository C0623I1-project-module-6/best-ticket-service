package com.codegym.bestticket.validation;

import com.codegym.bestticket.validation.validator.UniqueCustomerValidator;
import com.codegym.bestticket.validation.validator.UniqueUserValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueUserValidator.class)
public @interface UniqueUser {
    String message() default "The field must be unique!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
