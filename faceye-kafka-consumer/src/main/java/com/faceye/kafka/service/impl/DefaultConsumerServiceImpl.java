package com.faceye.kafka.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.faceye.kafka.service.ConsumerService;

/**
 *  默认消息接收器
 * @author songhaipeng
 *
 */
@Component
public class DefaultConsumerServiceImpl implements ConsumerService {
    private Logger logger=LoggerFactory.getLogger(DefaultConsumerServiceImpl.class);
	@KafkaListener(topics = "default-msg")
	@Override
	public void consume(String content) {
	   logger.debug(">>FaceYe Reveive kafka msg is:"+content);
	}

}
