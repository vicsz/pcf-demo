package com.example.pcfdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Value("${vcap.application.name:localMachine}")
    private String applicationName;

    @Value("${vcap.application.space_name:localSpace}")
    private String spaceName;


    @Value("${vcap.application.instance_id:localInstanceId}")
    private String instanceId;

    @RequestMapping("/")
    public String backendCall(){
        return "PCF Info: " + applicationName + "@" + spaceName + " " + instanceId;
    }
}