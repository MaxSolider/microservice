package com.vi.cloud.microservicesimpleprovideruser.controller;

import com.vi.cloud.microservicesimpleprovideruser.entity.User;
import com.vi.cloud.microservicesimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userRepository.findById(id).get();
    }
}
