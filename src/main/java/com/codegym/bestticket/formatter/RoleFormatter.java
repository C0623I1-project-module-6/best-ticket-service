package com.codegym.bestticket.formatter;

import com.codegym.bestticket.dto.user.RoleDto;
import com.codegym.bestticket.service.IRoleService;
import lombok.AllArgsConstructor;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;

@Component
@AllArgsConstructor
public class RoleFormatter implements Formatter<RoleDto> {
    private final IRoleService roleService;

    @Override
    public RoleDto parse(String text, Locale locale) throws ParseException {
        Optional<RoleDto> roleDto = roleService.findById(UUID.fromString(text));
        return roleDto.orElse(null);
    }

    @Override
    public String print(RoleDto object, Locale locale) {
        return "[" + object.getId() + ","
                + object.getName() + "]";
    }
}
