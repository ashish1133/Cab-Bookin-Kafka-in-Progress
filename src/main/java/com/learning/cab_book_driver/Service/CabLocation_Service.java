package com.learning.cab_book_driver.Service;

import com.learning.cab_book_driver.Constant.AppConstant;
import jdk.javadoc.doclet.Taglet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocation_Service {
    @Autowired
    private static KafkaTemplate<String,Object>KafkaTemplate;


        public static boolean updateLocation(String Location){
        KafkaTemplate.send(AppConstant.CAB_LOCATION, Location);
        return true;

    }

}
