package com.twetero.tweteroback.Models;

import com.twetero.tweteroback.dto.userDTO;

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

public class userModels {
    public userModels (userDTO req) {
        this.username = req.username();
        this.avatar = req.avatar();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String avatar;
}
