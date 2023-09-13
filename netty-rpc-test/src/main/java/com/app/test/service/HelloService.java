package com.app.test.service;

/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
public interface HelloService {
    String hello(String name);

    String hello(Person person);

    String hello(String name, Integer age);
}
