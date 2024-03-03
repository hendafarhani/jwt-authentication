package com.sample.jwtauthentication.service;


import com.sample.jwtauthentication.dao.UserDao;
import com.sample.jwtauthentication.model.User;
import com.sample.jwtauthentication.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public JwtUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByName(username);
        UserDao userDao = user.map(UserDao::convertToUserDao).orElse(null);
        if (userDao == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return userDao;
    }

}