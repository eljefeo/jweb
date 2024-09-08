package com.jmedia.jweb.controller;

import com.jmedia.jweb.model.JUser;
import com.jmedia.jweb.repo.JUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JUserController {

    @Autowired
    JUsersRepo repo;

    @PostMapping("/addJUser")
    public void addUsers(@RequestBody JUser jUser){
        repo.save(jUser);
    }
}
