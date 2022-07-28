package com.bjpowernode.producer.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String EXCHANGE_NAME = "boot_topics_exchange";
    public static final boolean EXCHANGE_DURABLE = true;
    public static final String QUEUE_NAME = "boot_queue";
    public static final String ROUTING_KEY = "boot.#";

    //1. 交换机
    @Bean("bootExchange")
    public Exchange bootExchange(){
        return ExchangeBuilder.topicExchange(EXCHANGE_NAME).durable(EXCHANGE_DURABLE).build();
    }
    //2. 队列
    @Bean("bootQueue")
    public Queue bootQueue(){
        return QueueBuilder.durable(QUEUE_NAME).build();
    }
    //3. 队列和交换机的绑定关系 Binding
    /*
    *   1.知道哪个队列
    *   2.知道哪个交换机
    *   3.routing key
    * */
    @Bean
    public Binding bindQueueExchange(@Qualifier("bootQueue") Queue queue,
                                     @Qualifier("bootExchange")Exchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY).noargs();
    }
}
