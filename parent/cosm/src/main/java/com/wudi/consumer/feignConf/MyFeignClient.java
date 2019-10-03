package com.wudi.consumer.feignConf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-provider-config")
public interface MyFeignClient {

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    String echo(@PathVariable(value = "string") String string);

    @RequestMapping(value = "/port", method = RequestMethod.GET)
    String getPort();
}
