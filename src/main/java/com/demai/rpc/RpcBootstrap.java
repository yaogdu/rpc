package com.demai.rpc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dear on 16/8/3.
 */
public class RpcBootstrap {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }
}
