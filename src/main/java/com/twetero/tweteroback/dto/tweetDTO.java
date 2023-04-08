package com.twetero.tweteroback.dto;

import jakarta.validation.constraints.NotBlank;

public record tweetDTO(
    @NotBlank String username,
    @NotBlank String tweet
)
{}
