package com.ttl.myspringboot.kafka.consumer;

import com.ttl.myspringboot.kafka.provider.KafkaSender;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Tangtl
 * @program: myspringboot
 * @Package com.ttl.myspringboot.kafka.consumer
 * @Title: KafkaReceiver
 * @Description:
 * @date 2018-08-10  18:02
 */
@Component
public class KafkaReceiver {

//    private static final Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);
//
//    @KafkaListener(topics = {"zhisheng"})
//    public void listen(ConsumerRecord<?, ?> record) {
//
//        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
//
//        if (kafkaMessage.isPresent()) {
//
//            Object message = kafkaMessage.get();
//
//            logger.info("----------------- record =" + record);
//            logger.info("------------------ message =" + message);
//        }
//
//    }
}
