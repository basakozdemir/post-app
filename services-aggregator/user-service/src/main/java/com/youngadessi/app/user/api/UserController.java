package com.youngadessi.app.user.api;

import com.youngadessi.app.user.dto.UserCreateDTO;
import com.youngadessi.app.user.dto.UserUpdateDTO;
import com.youngadessi.app.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping
    public ResponseEntity<String> updateUser(@RequestBody UserUpdateDTO userUpdateDTO){
        userService.updateUser(userUpdateDTO);
        return new ResponseEntity<>("User updated successfuly", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted successfuly", HttpStatus.OK);
    }

}
