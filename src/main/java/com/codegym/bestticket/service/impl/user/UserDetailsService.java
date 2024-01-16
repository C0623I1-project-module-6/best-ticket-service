package com.codegym.bestticket.service.impl.user;

import com.codegym.bestticket.entity.user.Customer;
import com.codegym.bestticket.entity.user.User;
import com.codegym.bestticket.repository.user.ICustomerRepository;
import com.codegym.bestticket.repository.user.IUserRepository;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findUser(username);
        if (user == null) {
            throw new UsernameNotFoundException("User " + username + "was not found in database!");
        }
        Customer customer = new Customer();
        List<String> roles = findRoles(user, customer);

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (String role : roles) {
            GrantedAuthority authority = new SimpleGrantedAuthority(role);
            grantedAuthorities.add(authority);
        }

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                grantedAuthorities);

        return userDetails;
    }

    private User findUser(String input) {
        if (input.contains("@")) {
            return userRepository.findByEmail(input);
        } else if (isNumeric(input)) {
            Customer customer = customerRepository.findByPhoneNumber(input);
            return customer.getUser();
        } else {
            return userRepository.findByUsername(input)
                    .orElseThrow(() -> new RuntimeException("User not found!"));
        }
    }

    private List<String> findRoles(User user, Customer customer) {
        if (user != null) {
            return userRepository.findRolesByUsername(user.getUsername());
        } else if (customer != null) {
            return userRepository.findRolesByPhoneNumber(customer.getPhoneNumber());
        } else {
            return userRepository.findRolesByEmail(user.getEmail());
        }
    }

    public boolean isNumeric(String input) {
        return StringUtils.isNumeric(input);
    }
}
