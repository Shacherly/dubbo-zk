package com.duyi.helloworld.api.impl;

import com.duyi.helloworld.api.HelloworldApi;
import com.duyi.helloworld.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloworldApi")
public class HelloworldApiImpl implements HelloworldApi {

    @Autowired
    private HelloworldService service;

    @Override
    public String sayHello(String name) {
        return service.sayHello(name);
    }

}
