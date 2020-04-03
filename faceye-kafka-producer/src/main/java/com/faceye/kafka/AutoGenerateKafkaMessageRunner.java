package com.faceye.kafka;

import com.faceye.kafka.service.ProducerService;
import com.faceye.kafka.service.impl.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author:haipenge
 * @Date:2020-04-02 09:53
 * @Version:1.0
 **/
@Component
public class AutoGenerateKafkaMessageRunner implements ApplicationRunner {
    @Autowired
    private ProducerService producerService=null;
    private Integer count =0;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        while(true) {
            String msg = MessageBuilder.builder();
            producerService.produce(msg);
            Thread.sleep(1000L);
//            count++;
//            if(count>500) {
//                Thread.sleep(1L);
//                count=0;
//            }
        }
    }
}
