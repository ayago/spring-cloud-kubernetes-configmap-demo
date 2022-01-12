package com.acy.example.kubernetes.configmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientContainer{

    @Autowired
    Configmap configmap;

    public ClientContainer(){
        super();
    }

    @GetMapping
    public String load() {
        return String.format(configmap.getMessage(), "", "");
    }
}
