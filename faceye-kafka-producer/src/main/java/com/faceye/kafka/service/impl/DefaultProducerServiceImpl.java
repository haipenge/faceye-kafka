package com.faceye.kafka.service.impl;

import com.faceye.core.util.Json;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.faceye.kafka.service.ProducerService;


@Service
public class DefaultProducerServiceImpl implements ProducerService {
	private Logger logger =LoggerFactory.getLogger(DefaultProducerServiceImpl.class);

	@Autowired
	private KafkaTemplate kafkaTemplate = null;

	@Override
	public void produce(String content) {
//		for (int i = 0; i < 10; i++) {
//			logger.debug(">>FaceYe -- kafka publish msg,index is:"+i);
			String message = this.buildMessage();
					logger.debug(">>FaceYe -- kafka publish msg:{}:",message);
			this.kafkaTemplate.send("default-msg",message);
//		}
	}


	class Message{
		private Long timestamp=0L;
		private String name ="";
		private String host="";

		public Long getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}
	}

	/* *
	 * @Author:haipenge
	 * @Description:Build Message
	 * @Date 09:02 2020-03-18
	 * @Param []
	 * @return java.lang.String
	 **/
	private int count =0;
	private String buildMessage(){
		String msg="";
		Message message =new Message();
		message.setHost("host");
		if(count % 2 == 0) {
			message.setName("flink");
		}else{
			message.setName("dlink");
		}
		message.setTimestamp(System.currentTimeMillis());
		msg = Json.toJson(message);
		count++;
		return msg;
	}


}
