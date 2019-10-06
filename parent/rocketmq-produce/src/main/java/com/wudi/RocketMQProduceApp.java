package com.wudi;

import com.wudi.bindings.MySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;


@SpringBootApplication
@EnableBinding({MySource.class})
public class RocketMQProduceApp implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(RocketMQProduceApp.class, args);
    }

    @Autowired
    private MySource source;

    @Override
    public void run(String... args) throws Exception {
        /*创建一个启动监听发送消息*/
        int count = 10;
        for (int index = 1; index <= count; index++) {
            String msgContent = "生产者提供的消息-" + index;
            boolean send = source.output().send(MessageBuilder.withPayload(msgContent).build());
            System.out.println("发送了第" + index + "条,结果" + send);
        }
        System.out.println("发送结束");
    }

}
