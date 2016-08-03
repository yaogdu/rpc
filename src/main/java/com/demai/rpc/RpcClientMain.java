package com.demai.rpc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dear on 16/8/3.
 */
public class RpcClientMain {

    public static void main(String[] args) {
        try {

            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

            RpcProxy proxy = (RpcProxy)ctx.getBean("rpcProxy");

            HelloService helloService = proxy.create(HelloService.class);
            String result = helloService.hello("World");

            System.out.println(result);

        } catch (Exception e) {
            System.out.println("error");
            System.exit(-1);
        }
    }
}
