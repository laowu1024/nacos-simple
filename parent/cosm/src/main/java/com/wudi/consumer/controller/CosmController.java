package com.wudi.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class CosmController {

    private final RestTemplate template;

    @Value("${userName}")
    String userName;

    @Autowired
    public CosmController(RestTemplate restTemplate) {
        this.template = restTemplate;
    }

    @GetMapping("/echo/{str}")
    public String useTem(@PathVariable String str) {
        return template.getForObject("http://service-provider-config/echo/" + str, String.class);
    }

    @GetMapping("/echo")
    public String useTem() {
        return "nocaos中的 ：" + userName;
    }


}
