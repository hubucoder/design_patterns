package com.hubu.pattern._2_factory.abstract_factory;
/**
 * @Description 意大利风味的甜点工厂
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/2 10:37
 **/
public class ItalyDessertFactory implements Factory {


    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
