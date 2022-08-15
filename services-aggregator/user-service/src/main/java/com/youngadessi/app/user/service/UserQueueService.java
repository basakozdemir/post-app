package com.youngadessi.app.user.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserQueueService {

    @RabbitListener(queues = {"user_queue"})
    public void consumeMessage(UserData userData){
        System.out.println(userData.toString());
    }

}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class UserData implements Serializable {
    private String username;
    private String role;
}