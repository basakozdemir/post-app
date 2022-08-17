package com.youngadessi.app.auth.service.controller;

import com.youngadessi.app.auth.service.model.JwtRequestDTO;
import com.youngadessi.app.auth.service.model.JwtResponseDTO;
import com.youngadessi.app.auth.service.service.JwtUserDetailsService;
import com.youngadessi.app.auth.service.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    @PostMapping("/login")
    public ResponseEntity<JwtResponseDTO> createToken(@RequestBody JwtRequestDTO request) throws Exception {
        final UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(request.getUsername());
        final String jwtToken = jwtTokenUtil.generateJwtToken(userDetails);
        return ResponseEntity.ok(new JwtResponseDTO(jwtToken));
    }
}
