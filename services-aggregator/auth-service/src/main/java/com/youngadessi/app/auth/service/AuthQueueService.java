package com.youngadessi.app.auth.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthQueueService {

    private final RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void produceMessage() throws InterruptedException {

        for (; ; ) {
            Thread.sleep(5000);

            rabbitTemplate.convertAndSend("user_exchange", "user_routing_key", new UserData("username_" + UUID.randomUUID(), "ADMIN"));
        }
    }

}

@Getter
@Setter
@AllArgsConstructor
class UserData implements Serializable {
    private String username;
    private String role;
}
