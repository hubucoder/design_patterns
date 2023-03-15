package com.hubu.pattern._2_factory.factory_method;

/**
 * @Description 专门用来生产拿铁咖啡
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 21:00
 **/
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
