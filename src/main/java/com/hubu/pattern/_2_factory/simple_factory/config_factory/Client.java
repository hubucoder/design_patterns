package com.hubu.pattern._2_factory.simple_factory.config_factory;

import com.hubu.pattern._2_factory.simple_factory.Coffee;

/**
 * 测试 简单工厂+配置文件
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = ConfigCoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());

        System.out.println("=====================");
        Coffee latte = ConfigCoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
