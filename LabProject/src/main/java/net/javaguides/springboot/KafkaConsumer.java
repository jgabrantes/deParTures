/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javaguides.springboot;

import java.io.IOException;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


/**
 *
 * @author Duarte Henriques
 */
@Service
public class KafkaConsumer {
    
    
    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("## -> Consumed message -> %s", message));
    }
}
