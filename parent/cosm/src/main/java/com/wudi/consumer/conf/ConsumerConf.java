package com.wudi.consumer.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConf {

    @Bean
    @LoadBalanced
    public RestTemplate getClient(){
        return new RestTemplate();
    }
}
