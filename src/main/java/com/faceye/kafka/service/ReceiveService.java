package com.faceye.kafka.service;
/**
 * Kafka receive message
 * @author songhaipeng
 *
 */
public interface ReceiveService {
   public void process(String content);
}
