package com.consumer;
import com.alibaba.dubbo.config.annotation.Reference;
import com.common.server.DemoService;
import org.springframework.stereotype.Component;

/**
 * 服务消费者：service是spring的注解
 */
@Component("anotationConsumer")
public class AnotationConsumer {

    /**
     * 远程服务代理，可以和本地bean一样使用demoService
     */
    @Reference(check = false)
    private DemoService demoService;

    public void print(){
        System.out.println(demoService.greet("张三"));
        System.out.println(demoService.getUsers());
    }
}
