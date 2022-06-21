package com.youngadessi.app.user.service;

import com.youngadessi.app.user.dto.UserCreateDTO;
import com.youngadessi.app.user.entity.User;
import com.youngadessi.app.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public void createUser(UserCreateDTO userCreateDTO) {

        //mapstruct ???
        User user=new User();
        user.setEmail(userCreateDTO.getEmail());
        user.setFullname(userCreateDTO.getFullname());
        user.setPassword(userCreateDTO.getPassword());
        user.setUsername(userCreateDTO.getUsername());

        userRepository.save(user);

    }
}
