package com.netty.rpc.client.handler;

/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
public interface AsyncRPCCallback {

    void success(Object result);

    void fail(Exception e);

}
