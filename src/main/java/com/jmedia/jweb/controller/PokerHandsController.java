package com.jmedia.jweb.controller;

import com.jmedia.jweb.model.JUsers;
import com.jmedia.jweb.model.PokerHands;
import com.jmedia.jweb.repo.JUsersRepo;
import com.jmedia.jweb.repo.PokerHandsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokerHandsController {

    @Autowired
    PokerHandsRepo repo;

    @PostMapping("/addPokerHand")
    public void addUsers(@RequestBody PokerHands pokerHand){
        repo.save(pokerHand);
    }

    @PostMapping("/addPokerHands")
    public void addUsers(@RequestBody List<PokerHands> pokerHands){
        for(PokerHands hand : pokerHands)
            repo.save(hand);
    }
}
