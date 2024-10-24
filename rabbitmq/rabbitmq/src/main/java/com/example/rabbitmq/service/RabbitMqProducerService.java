package com.example.rabbitmq.service;

import com.example.rabbitmq.dto.MyMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RabbitMqProducerService {

    private final RabbitTemplate rabbitTemplate;

    private static final String EXCHANGE_NAME = "myhome.exchange";


    public String publish(final String myMessage) {
        log.info("message {}", myMessage);
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "myhome.lovethefeel.#", myMessage);

        return myMessage;
    }
}
