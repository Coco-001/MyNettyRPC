package com.app.test.service;

import com.netty.rpc.annotation.RpcAutowired;

/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
public class FooService implements Foo {
    @RpcAutowired(version = "1.0")
    private HelloService helloService1;

    @RpcAutowired(version = "2.0")
    private HelloService helloService2;

    @Override
    public String say(String s) {
        return helloService1.hello(s);
    }
}
