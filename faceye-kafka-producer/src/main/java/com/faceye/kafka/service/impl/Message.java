package com.faceye.kafka.service.impl;

/**
 * @Description:
 * @Author:haipenge
 * @Date:2020-04-02 09:56
 * @Version:1.0
 **/
public class Message {
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
