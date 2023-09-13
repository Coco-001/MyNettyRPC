package com.app.test.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
public class RpcServerBootstrap {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("server-spring.xml");
    }
}
