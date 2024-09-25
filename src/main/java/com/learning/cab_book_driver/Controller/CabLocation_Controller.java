package com.learning.cab_book_driver.Controller;

import com.learning.cab_book_driver.Service.CabLocation_Service;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Location")
public class CabLocation_Controller {

    @Autowired
    private CabLocation_Service service;

    //Business Logic

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int range =100;
        while (range>0){
            CabLocation_Service.updateLocation(Math.random()+" , "+Math.random());
            Thread.sleep(1000);
            range--;
        }

        return new ResponseEntity<>
                (Map.of("message","Location"),HttpStatus.OK);
    }

}
