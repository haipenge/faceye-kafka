package com.faceye.kafka.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.faceye.kafka.service.ReceiveService;

/**
 *  默认消息接收器
 * @author songhaipeng
 *
 */
@Component
public class DefaultReceiveServiceImpl implements ReceiveService {
    private Logger logger=LoggerFactory.getLogger(DefaultReceiveServiceImpl.class);
	@KafkaListener(topics = "default-msg")
	@Override
	public void process(String content) {
	   logger.debug(">>FaceYe Reveive kafka msg is:"+content);
	}

}
