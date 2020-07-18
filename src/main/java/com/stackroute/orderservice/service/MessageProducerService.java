package com.stackroute.orderservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * MessageProducerService class should be used to send messages to Kafka Topic
 * **TODO**
 * This class should use KafkaTemplate to send OrderDto message
 */

public class MessageProducerService {

    private static final Logger logger = LoggerFactory.getLogger(MessageProducerService.class);

    @Value("${kafka.topic-name}")
    private String topic;

    /**
     * **TODO**
     * Inject a bean of KafkaTemplate created in KafkaConfig class
     */

    /**
     * **TODO**
     * Create a method sendOrderMessage(OrderDto message)
     * to send order details message to Kafka topic
     */

}