package com.acy.example.kubernetes.configmap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "beanx")
public class Configmap{
    private String message = "Message from backend is: %s <br/> Services : %s";

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
