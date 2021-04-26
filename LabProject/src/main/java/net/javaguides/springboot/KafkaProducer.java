/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javaguides.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


/**
 *
 * @author Duarte Henriques
 */

@Service
public class KafkaProducer{
    private static final String TOPIC = "test";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        //logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }
}