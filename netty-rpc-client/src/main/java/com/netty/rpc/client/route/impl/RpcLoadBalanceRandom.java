package com.netty.rpc.client.route.impl;

import com.netty.rpc.client.handler.RpcClientHandler;
import com.netty.rpc.client.route.RpcLoadBalance;
import com.netty.rpc.protocol.RpcProtocol;

import java.util.*;

/**
 * @Author: Mr.Shan
 * @Version: v1.0
 */
public class RpcLoadBalanceRandom extends RpcLoadBalance {
    private Random random = new Random();

    public RpcProtocol doRoute(List<RpcProtocol> addressList) {
        int size = addressList.size();
        // Random
        return addressList.get(random.nextInt(size));
    }

    @Override
    public RpcProtocol route(String serviceKey, Map<RpcProtocol, RpcClientHandler> connectedServerNodes) throws Exception {
        Map<String, List<RpcProtocol>> serviceMap = getServiceMap(connectedServerNodes);
        List<RpcProtocol> addressList = serviceMap.get(serviceKey);
        if (addressList != null && addressList.size() > 0) {
            return doRoute(addressList);
        } else {
            throw new Exception("Can not find connection for service: " + serviceKey);
        }
    }
}
