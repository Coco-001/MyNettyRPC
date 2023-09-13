package com.netty.rpc.serializer;
/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
public abstract class Serializer {
    public abstract <T> byte[] serialize(T obj);

    public abstract <T> Object deserialize(byte[] bytes, Class<T> clazz);
}
