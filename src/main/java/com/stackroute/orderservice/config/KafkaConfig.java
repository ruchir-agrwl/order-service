package com.stackroute.orderservice.config;


import com.stackroute.orderservice.dto.OrderDto;
import com.stackroute.orderservice.service.MessageProducerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.Map;

/**
 * **TODO
 * Configure all the beans as described below to send messages to Kafka Message broker.
 * Add appropriate annotation to this Bean Configuration class
 */

public class KafkaConfig {

    @Value("${kafka.bootstrap-servers}")
    private String bootstrapServers;

    /**
     * TODO**
     * Create a Bean of type Map<String, Object> containing the configuration
     * of Kafka Producer. The configuration should include bootstrap server, message key and value serializers
     * message key should be of type String and Value should be of type Json containing Order details
     *  present in OrderDto
     */
    @Bean
    public Map<String, Object> producerConfigs() {
        return null;
    }

    /**
     * TODO**
     * Create a Bean of ProducerFactory<String, OrderDto> using the above
     * producer configuration
     */
    @Bean
    public ProducerFactory<String, OrderDto> producerFactory() {
        return null;
    }

    /**
     * TODO**
     * Create a bean of KafkaTemplate with the above ProducerFactory
     */
    @Bean
    public KafkaTemplate<String, OrderDto> kafkaTemplate() {
        return null;
    }

    /**
     * TODO**
     * Create a bean of MessageProducerService
     */
    @Bean
    public MessageProducerService producer() {
        return null;
      }


}
