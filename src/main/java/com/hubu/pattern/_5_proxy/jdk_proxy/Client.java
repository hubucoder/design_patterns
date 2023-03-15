package com.hubu.pattern._5_proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        // 创建代理对象
        // 1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2. 使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        // 3. 调用卖票的方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass()); // 先将代理类的名称打印出来

        // 然后让程序一直执行
        while (true) {}
    }
}
