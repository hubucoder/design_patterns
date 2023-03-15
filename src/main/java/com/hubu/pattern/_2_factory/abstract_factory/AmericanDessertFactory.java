package com.hubu.pattern._2_factory.abstract_factory;
/**
 * @Description 美式风味的甜点工厂
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/2 10:36
 **/
public class AmericanDessertFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }
}
