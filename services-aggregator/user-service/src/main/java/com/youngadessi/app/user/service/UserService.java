package com.youngadessi.app.user.service;

import com.youngadessi.app.user.dto.UserCreateDTO;
import com.youngadessi.app.user.dto.UserDeleteDTO;
import com.youngadessi.app.user.dto.UserUpdateDTO;
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

    public void deleteUser(UserDeleteDTO userDeleteDTO){
        User user = new User();
        user.setId(userDeleteDTO.getId());

        userRepository.delete(user);
    }

    public void updateUser(UserUpdateDTO userUpdateDTO){
        User user = new User();
        userRepository.findById(userUpdateDTO.getId());

        user.setPassword(userUpdateDTO.getPassword());
        user.setEmail(userUpdateDTO.getEmail());
        user.setFullname(userUpdateDTO.getFullname());



        userRepository.save(user);
    }
}
