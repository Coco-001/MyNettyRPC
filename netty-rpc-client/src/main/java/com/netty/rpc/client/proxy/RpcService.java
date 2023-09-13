package com.netty.rpc.client.proxy;

import com.netty.rpc.client.handler.RpcFuture;

/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
public interface RpcService<T, P, FN extends SerializableFunction<T>> {
    RpcFuture call(String funcName, Object... args) throws Exception;

    /**
     * lambda method reference
     */
    RpcFuture call(FN fn, Object... args) throws Exception;

}