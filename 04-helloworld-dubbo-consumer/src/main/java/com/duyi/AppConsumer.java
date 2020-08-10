package com.duyi;

import com.duyi.helloworld.api.HelloworldApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppConsumer {
    // @Reference
    // HelloworldApi bean;
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo/helloworld-consumer.xml");
        // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/application.xml");
        ctx.start();
        HelloworldApi bean = ctx.getBean(HelloworldApi.class);
        System.out.println(bean.sayHello("我？？？？"));


        // System.out.println("Hello World!");
    }
}
