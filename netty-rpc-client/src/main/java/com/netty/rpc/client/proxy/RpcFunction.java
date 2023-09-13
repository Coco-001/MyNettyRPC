package com.netty.rpc.client.proxy;

/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
@FunctionalInterface
public interface RpcFunction<T, P> extends SerializableFunction<T> {
    Object apply(T t, P p);
}
