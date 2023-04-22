package com.example.springdata;


import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

@Service
public class UserService<UserRepository> {
 
    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
 
    /**
     * @param newUser
     * @return
     */
    public User saveUser(com.example.springdata.User newUser) {
        return ((UserService) userRepository).saveUser(newUser);
    }
}

