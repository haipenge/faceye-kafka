package com.faceye.kafka.service.impl;

import com.faceye.core.util.Json;

/**
 * @Description:
 * @Author:haipenge
 * @Date:2020-04-02 09:56
 * @Version:1.0
 **/
public class MessageBuilder {
    private static int count =0;
    public static String builder(){
        String msg="";
        Message message =new Message();
        message.setHost("host");
        if(count % 2 == 0) {
            message.setName("flink");
        }else{
            message.setName("dlink");
        }
        count++;
        message.setTimestamp(System.currentTimeMillis());
        msg = Json.toJson(message);
        return msg;
    }
}
