package com.jmedia.jweb.controller;

//import com.jmedia.poker;

import com.jmedia.jweb.model.PokerHands;
import com.jmedia.jweb.repo.PokerHandsRepo;
import com.jmedia.poker.DeadHorse;
import com.jmedia.poker.DeadHorse7;
import com.jmedia.poker.PokerHand;
import com.jmedia.poker.Util5;
import com.jmedia.poker.Util7;
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

    @PostMapping("/evalHand5")
    public String evalHand5(@RequestBody PokerHand hand){
        for(String s : hand.getCards()){
            System.out.println("Card: " + s);
        }
        int res = DeadHorse.eval5(hand);
        String handDescription = Util5.decode5CardHand(res, false);
        return handDescription;
    }

    @PostMapping("/evalHand7")
    public String evalHand7(@RequestBody PokerHand hand) throws Exception {
        for(String s : hand.getCards()){
            System.out.println("Card: " + s);
        }
        long res = DeadHorse7.eval7(hand);
        String handDescription = Util7.decode7CardHand(res, false);
        return handDescription;
    }
}
