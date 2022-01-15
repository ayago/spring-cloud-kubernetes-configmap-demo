package com.acy.example.kubernetes.configmap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")
public class Configmap{
    private String message = "Hello";

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
