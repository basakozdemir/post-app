package com.youngadessi.app.user.api;

import com.youngadessi.app.user.dto.UserCreateDTO;
import com.youngadessi.app.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody  UserCreateDTO userCreateDTO){
        userService.createUser(userCreateDTO);
        return new ResponseEntity<>("User created successfuly", HttpStatus.OK);
    }

}
