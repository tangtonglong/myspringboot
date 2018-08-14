package com.ttl.myspringboot.kafka.provider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ttl.myspringboot.common.DruidConfiguration;
import com.ttl.myspringboot.kafka.bean.Message;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Tangtl
 * @program: myspringboot
 * @Package com.ttl.myspringboot.kafka.provider
 * @Title: KafkaSender
 * @Description:
 * @date 2018-08-10  17:50
 */
@Component
@Slf4j
public class KafkaSender {

//    private static final Logger logger = LoggerFactory.getLogger(KafkaSender.class);
//
//    @Autowired
//    private KafkaTemplate<String, String>  kafkaTemplate;
//
//    private Gson gson = new GsonBuilder().create();
//
//    //发送消息方法
//    public void send() {
//        Message message = new Message();
//        message.setId(System.currentTimeMillis());
//        message.setMsg(UUID.randomUUID().toString());
//        message.setSendTime(LocalDateTime.now());
//        logger.info("+++++++++++++++++++++  message = {}", gson.toJson(message));
//        kafkaTemplate.send("zhisheng", gson.toJson(message));
//    }
}
