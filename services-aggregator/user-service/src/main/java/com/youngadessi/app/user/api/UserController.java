package com.youngadessi.app.user.api;

import com.youngadessi.app.user.dto.UserCreateDTO;
import com.youngadessi.app.user.dto.UserDeleteDTO;
import com.youngadessi.app.user.dto.UserUpdateDTO;
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

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody  UserCreateDTO userCreateDTO){
        userService.createUser(userCreateDTO);
        return new ResponseEntity<>("User created successfuly", HttpStatus.OK);
    }


    @PostMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestBody UserDeleteDTO userDeleteDTO){
        userService.deleteUser(userDeleteDTO);
        return new ResponseEntity<>("User is deleted", HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateUser(@RequestBody UserUpdateDTO userUpdateDTO){
        userService.updateUser(userUpdateDTO);
        return new ResponseEntity<>("User is updated", HttpStatus.OK);
    }

}
