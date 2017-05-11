package com.faceye.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
/**
 * Application java
 * @author songhaipeng
 *
 */
@SpringBootApplication	
public class Application {
	public static void main(String[] args) throws Exception {
		//禁止重启
//		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(Application.class, args);
	}
}
