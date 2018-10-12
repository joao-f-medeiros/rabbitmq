package com.javaee.rabbitmq.services;

import org.springframework.stereotype.Service;

import com.javaee.rabbitmq.domain.Message;

@Service
public class MessageServiceImpl implements MessageService{

    public MessageServiceImpl() {
    }
    
    @Override
    public void sendMessage(Message message) {
    }
}
