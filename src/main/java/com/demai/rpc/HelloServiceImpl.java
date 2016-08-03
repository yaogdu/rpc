package com.demai.rpc;

/**
 * Created by dear on 16/8/3.
 */

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

    static{
        System.out.println("hello service impl started");
    }
}
