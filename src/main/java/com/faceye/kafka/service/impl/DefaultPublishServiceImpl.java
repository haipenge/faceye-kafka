package com.faceye.kafka.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.faceye.kafka.service.PublishService;

@Service
public class DefaultPublishServiceImpl implements PublishService {
	private Logger logger =LoggerFactory.getLogger(DefaultPublishServiceImpl.class);
	@Autowired
	private KafkaTemplate kafkaTemplate = null;

	@Override
	public void publish(String content) {
		for (int i = 0; i < 10; i++) {
			logger.debug(">>FaceYe -- kafka publish msg,index is:"+i);
			this.kafkaTemplate.send("default-msg", "I am a test msg,index is:" + i);
		}
	}

}
