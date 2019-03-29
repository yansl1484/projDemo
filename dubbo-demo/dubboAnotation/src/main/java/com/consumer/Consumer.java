package com.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();

        AnotationConsumer anotationConsumer = (AnotationConsumer) context.getBean("anotationConsumer");
        anotationConsumer.print();
    }
}
