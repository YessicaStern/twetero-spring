package com.twetero.tweteroback.Models;

import com.twetero.tweteroback.dto.tweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class tweetModels {
    public tweetModels(tweetDTO req) {
        this.username = req.username();
        this.tweet = req.tweet();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String tweet;
    
}
