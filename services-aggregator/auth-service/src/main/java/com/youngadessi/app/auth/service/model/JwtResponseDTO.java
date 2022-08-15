package com.youngadessi.app.auth.service.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public class JwtResponseDTO implements Serializable {
    private final String token;
}
