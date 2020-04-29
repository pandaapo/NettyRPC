package com.panda.netty.rpc.provider;

import com.panda.netty.rpc.api.IRpcHelloService;

public class RpcHelloServiceImpl implements IRpcHelloService {

    @Override
    public String hello(String name) {
        return "Hello " + name + "!";
    }
}
