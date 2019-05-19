package com.example.gfilangeri.github.echoservlet.service;

import com.example.gfilangeri.github.echoservlet.entities.User;
import com.example.gfilangeri.github.echoservlet.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User insert(User user) {
        User currentUser;
        Boolean exists = userRepository.existsByEmail(user.getEmail());
        if (!exists) {
            userRepository.save(user);
        }
        currentUser = userRepository.findByEmail(user.getEmail());
        return currentUser;
    }
}
