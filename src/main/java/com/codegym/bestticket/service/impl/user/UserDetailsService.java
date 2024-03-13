package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.exception.user.CustomerNotFoundException;
import com.codegym.bestticket.exception.user.UserNotFoundException;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    private final IUserRepository userRepository;
    private final ICustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findUser(username);
        if (user == null) {
            throw new UsernameNotFoundException("User " + username + "was not found in database!");
        }
        Customer customer = Optional.of(user)
                .map(User::getCustomer)
                .orElse(null);
        List<String> roles = findRoles(user, customer);

        List<GrantedAuthority> grantedAuthorities = roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                grantedAuthorities);
    }

    private User findUser(String input) {
        if (input.contains("@")) {
            return userRepository.findByEmail(input)
                    .orElseThrow(() -> new UserNotFoundException("User not found!"));
        } else if (isNumeric(input)) {
            return customerRepository.findByPhoneNumber(input)
                    .map(Customer::getUser)
                    .orElseThrow(() -> new CustomerNotFoundException("Customer not found!"));
        } else {
            return userRepository.findByUsername(input)
                    .orElseThrow(() -> new UserNotFoundException("User not found!"));
        }
    }

    private List<String> findRoles(User user, Customer customer) {
        return Optional.ofNullable(user)
                .map(u -> userRepository.findRolesByUsername(u.getUsername()))
                .orElseGet(() -> Optional.ofNullable(customer)
                        .map(c -> userRepository.findRolesByPhoneNumber(c.getPhoneNumber()))
                        .orElseGet(() -> {
                            assert user != null;
                            return userRepository.findRolesByEmail(user.getEmail());
                        }));
    }

    public boolean isNumeric(String input) {
        return StringUtils.isNumeric(input);
    }
}



