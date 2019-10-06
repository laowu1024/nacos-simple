package com.wudi.bindings;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

//自定义source  这里注意和配置文件中进行对应
public interface MySource {

    @Output("output")
    MessageChannel output();

}
