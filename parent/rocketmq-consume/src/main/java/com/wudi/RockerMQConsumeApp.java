package com.wudi;

import com.wudi.bindings.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MySink.class)
public class RockerMQConsumeApp {
    public static void main(String[] args) {
        SpringApplication.run(RockerMQConsumeApp.class, args);
    }
}
