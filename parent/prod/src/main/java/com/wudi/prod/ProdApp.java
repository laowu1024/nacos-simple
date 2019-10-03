package com.wudi.prod;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class ProdApp {
    public static void main(String[] args) {
        SpringApplication.run(ProdApp.class, args);
    }

    @RestController
    class EchoController {

        @Value("${server.port}")
        String port;

        @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
        public String echo(@PathVariable("string") String string) {
            return "Hello Nacos Discovery " + string;
        }

        @RequestMapping(value = "/port", method = RequestMethod.GET)
        public String getPort() {
            return "当前的port:" + port;
        }
    }
}
