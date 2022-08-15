package com.youngadessi.app.auth.service.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class JwtRequestDTO implements Serializable {
    private String username;

    private String password;
}
