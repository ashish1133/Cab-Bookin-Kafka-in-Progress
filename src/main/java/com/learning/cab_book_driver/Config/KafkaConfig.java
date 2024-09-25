package com.learning.cab_book_driver.Config;

import com.learning.cab_book_driver.Constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {


    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(AppConstant.CAB_LOCATION)
                .build();
    }

}
