package com.wudi.consumer.controller;

import com.wudi.consumer.feignConf.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeignController {

    @Autowired
    MyFeignClient client;

    @RequestMapping(value = "/feign/echo/{string}", method = RequestMethod.GET)
    public String getEcho(@PathVariable(value = "string") String string) {
        return client.echo(string + " from feignClient");
    }

    @RequestMapping(value = "/port", method = RequestMethod.GET)
    public String getPort() {
        return client.getPort();
    }


}
