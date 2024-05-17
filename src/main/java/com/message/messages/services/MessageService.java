package com.message.messages.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    @Bean
    public String getMessage(){
        return "This is the amazing message";
    }
}
