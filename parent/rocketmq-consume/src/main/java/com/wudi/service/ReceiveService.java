package com.wudi.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiveService {

    @StreamListener("input")
    public void receiveInput1(String receiveMsg) {
        System.out.println("消费者接受到生产者的消息: " + receiveMsg);
    }

}
