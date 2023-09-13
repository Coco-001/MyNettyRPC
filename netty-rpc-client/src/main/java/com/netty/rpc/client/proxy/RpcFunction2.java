package com.netty.rpc.client.proxy;
/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
@FunctionalInterface
public interface RpcFunction2<T, P1, P2> extends SerializableFunction<T> {
    Object apply(T t, P1 p1, P2 p2);
}
