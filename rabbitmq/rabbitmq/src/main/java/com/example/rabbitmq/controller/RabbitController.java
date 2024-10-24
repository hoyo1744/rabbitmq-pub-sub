package com.example.rabbitmq.controller;

import com.example.rabbitmq.dto.MyMessage;
import com.example.rabbitmq.service.RabbitMqProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/rabbitmq")
public class RabbitController {

    private final RabbitMqProducerService producerService;


    @PostMapping("/publish")
    public String publish(@RequestParam("myMessage") String myMessage) {
        return producerService.publish(myMessage).toString();
    }
}
