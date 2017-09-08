package com.faceye.kafka.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultProducerServiceTestCase {
	@Autowired
	private ProducerService defaultProducerService = null;

	@Test
	public void testDefaultProducer() throws Exception {
		while (true) {
			defaultProducerService.produce("a test message 2 spark now ");
			Thread.sleep(1000L);
		}
	}
}
