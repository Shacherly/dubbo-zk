package com.duyi.helloworld.service.impl;

import com.duyi.helloworld.service.HelloworldService;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service("helloworldService")
public class HelloWorldServiceImpl implements HelloworldService {

    @Override
    public String sayHello(String name) {
        System.err.println("service impl");
        // try {
        //     System.in.read();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        return "hello world " + name;
    }
}
