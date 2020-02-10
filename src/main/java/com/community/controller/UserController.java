package com.community.controller;

import com.community.domain.User;
import com.community.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User insert(@PathVariable("id") Integer id)
    {
        User user = userRepository.findOne(id);
        return user;
    }
}
