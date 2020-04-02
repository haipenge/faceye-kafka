package com.faceye.kafka.service.impl;

import com.faceye.kafka.service.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class DefaultProducerServiceImpl implements ProducerService {
    private Logger logger = LoggerFactory.getLogger(DefaultProducerServiceImpl.class);

    @Autowired
    private KafkaTemplate kafkaTemplate = null;

    @Override
    public void produce(String content) {
        logger.debug(">>FaceYe -- kafka publish msg:{}:", content);
        this.kafkaTemplate.send("default-msg", content);
    }


}
