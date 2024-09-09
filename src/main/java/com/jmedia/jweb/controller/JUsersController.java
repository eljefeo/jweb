package com.jmedia.jweb.controller;

import com.jmedia.jweb.model.JUsers;
import com.jmedia.jweb.repo.JUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JUsersController {

    @Autowired
    JUsersRepo repo;

    @PostMapping("/addJUser")
    public void addUsers(@RequestBody JUsers jUser){
        repo.save(jUser);
    }
}
