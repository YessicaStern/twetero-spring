package com.twetero.tweteroback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twetero.tweteroback.Models.tweetModels;

public interface tweetRepository extends JpaRepository<tweetModels, Long> {
    
}
