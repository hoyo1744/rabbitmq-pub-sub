package com.example.rabbitmq.dto;

import lombok.Data;

@Data
public class MyMessage {
    private String message;
    private String from;
    private String to;
}
