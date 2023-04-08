package com.twetero.tweteroback.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;

public record userDTO(
    @NotBlank String username,
    @NotBlank @URL String avatar
) {}