package com.learnspringboot.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CurrentTimeService {

   public String getCurrentDateTime() {
       String message = "Hello from DEV environment and the current time is ";
       LocalDateTime localDateTime = LocalDateTime.now();
       return message.concat(localDateTime.toString());
   }

}
