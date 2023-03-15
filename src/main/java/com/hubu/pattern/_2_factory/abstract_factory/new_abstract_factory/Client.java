package com.hubu.pattern._2_factory.abstract_factory.new_abstract_factory;

public class Client {
    public static void main(String[] args) {
        try {
            Coffee coffee = Factory.createCoffee
                    ("com.hubu.pattern._2_factory.abstract_factory.new_abstract_factory.LatteCoffee");
            // 成功获取到拿铁咖啡
            System.out.println(coffee.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
