package com.example.gfilangeri.github.echoservlet.controller;

import com.example.gfilangeri.github.echoservlet.entities.User;
import com.example.gfilangeri.github.echoservlet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user")
    @CrossOrigin
    public User newUser(@RequestBody User user) {
        return userService.insert(user);
    }
}
