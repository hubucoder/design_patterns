package com.hubu.pattern._2_factory.factory_method;
/**
 * @Description 专门用来生产美式咖啡
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 20:59
 **/
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
