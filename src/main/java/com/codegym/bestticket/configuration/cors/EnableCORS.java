package com.codegym.bestticket.configuration.cors;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({com.codegym.bestticket.configuration.cors.CorsAutoConfiguration.class})
public @interface EnableCORS {
}