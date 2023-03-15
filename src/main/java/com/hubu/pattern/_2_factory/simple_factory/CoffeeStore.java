package com.hubu.pattern._2_factory.simple_factory;
/**
 * @Description 咖啡店
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 20:07
 **/
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);
        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
