package com.twetero.tweteroback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twetero.tweteroback.Models.tweetModels;
import com.twetero.tweteroback.Models.userModels;
import com.twetero.tweteroback.dto.tweetDTO;
import com.twetero.tweteroback.dto.userDTO;
import com.twetero.tweteroback.repository.tweetRepository;
import com.twetero.tweteroback.repository.userRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")

public class tweteroController {
    @Autowired private userRepository repositoryUser;
    @Autowired private tweetRepository repositoryTweet;
    
    @PostMapping("sign-up") 
    public String postUser(@RequestBody @Valid userDTO req){
        var res = repositoryUser.save(new userModels(req));
        System.out.println(res);
        return "OK";
    }

    @GetMapping("{id}") 
    public String getUser(@PathVariable Long id){
        var res = repositoryUser.getReferenceById(id);
        System.out.println(res);
        return res.toString();
    }

    @PostMapping("tweets")
    public String postTweet(@RequestBody @Valid tweetDTO req){
        var res = repositoryTweet.save(new tweetModels(req));
        System.out.println(res);
        return "OK";
    }

    
}
