package com.twetero.tweteroback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twetero.tweteroback.Models.userModels;

public interface userRepository extends JpaRepository<userModels, Long>{
    
}
