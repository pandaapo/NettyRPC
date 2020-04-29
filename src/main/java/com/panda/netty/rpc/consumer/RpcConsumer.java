package com.panda.netty.rpc.consumer;

import com.panda.netty.rpc.api.IRpcHelloService;
import com.panda.netty.rpc.api.IRpcService;
import com.panda.netty.rpc.consumer.proxy.RpcProxy;

public class RpcConsumer {

    public static void main(String[] args) {
        IRpcHelloService rpchello = RpcProxy.create(IRpcHelloService.class);
        System.out.println(rpchello.hello("小黄同学"));

        IRpcService service = RpcProxy.create(IRpcService.class);
        System.out.println("8 + 2 = " + service.add(8, 2));
        System.out.println("8 - 2 = " + service.sub(8, 2));
        System.out.println("8 * 2 = " + service.mult(8, 2));
        System.out.println("8 / 2 = " + service.div(8, 2));
    }
}
