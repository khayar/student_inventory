package com.main.student.inventory.studentInventory.util;

import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AMQPConfiguration {

    @Bean
    public TopicExchange ListItemTopicExchange(@Value("${amqp.exchange.items}") final String exchangeName){
            return ExchangeBuilder.topicExchange(exchangeName).durable(true).build();
    }

    public Jackson2JsonMessageConverter producerJackson2MessageConvertor(){
        return new Jackson2JsonMessageConverter();
    }
}
