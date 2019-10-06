package com.wudi.bindings;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {

    @Input("input")
    SubscribableChannel input();

}
