package com.example.rabbitmq.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMqConsumerService {


    @RabbitListener(queues = "myhome.queue")
    public void receiveMessage(final Message message) {
        log.info("Message {}", message);
        String receiveMsg = message.getBody().toString();
        log.info("message String {}", receiveMsg);
    }
}
