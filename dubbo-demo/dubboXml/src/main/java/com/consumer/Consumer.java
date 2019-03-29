package com.consumer;

import com.common.server.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.greet("张三"));
        System.out.println(demoService.getUsers());
    }
}
