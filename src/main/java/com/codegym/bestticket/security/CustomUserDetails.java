//package com.codegym.bestticket.security;
//
//import com.codegym.bestticket.entity.user.User;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.time.LocalDateTime;
//import java.util.Collection;
//import java.util.List;
//import java.util.UUID;
//import java.util.stream.Collectors;
//
//@Data
//@AllArgsConstructor
//public class CustomUserDetails implements UserDetails {
//    private UUID id;
//    private String username;
//    @JsonIgnore
//    private String password;
//    private String email;
//    private LocalDateTime created;
//    private String rememberToken;
//    private String avatar;
//    private Boolean isDeleted;
//    private Boolean isActived;
//    private Collection<?extends GrantedAuthority> authorities;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return this.authorities;
//    }
//public static CustomUserDetails mapUserToUserDetail(User user){
//    List<GrantedAuthority> authorityList=user.getRoles().stream()
//            .map(roles ->new SimpleGrantedAuthority(roles.getName()))
//            .collect(Collectors.toList());
//    return new CustomUserDetails(
//            user.getId(),
//            user.getUsername(),
//            user.getPassword(),
//            user.getEmail(),
//            user.getCreated(),
//            user.getRememberToken(),
//            user.getAvatar(),
//            user.getIsDeleted(),
//            user.getIsActived(),
//            authorityList
//    );
//}
//    @Override
//    public String getPassword() {
//        return this.password;
//    }
//
//    @Override
//    public String getUsername() {
//        return this.username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
