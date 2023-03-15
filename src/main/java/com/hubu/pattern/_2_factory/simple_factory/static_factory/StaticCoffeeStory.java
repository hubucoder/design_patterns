package com.hubu.pattern._2_factory.simple_factory.static_factory;

import com.hubu.pattern._2_factory.simple_factory.Coffee;
/**
 * @Description 咖啡店
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 20:18
 **/
public class StaticCoffeeStory {
    public Coffee orderCoffee(String type) {
        // 调用生产咖啡的方法
        Coffee coffee = StaticSimpleCoffeeFactory.createCoffee(type);
        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
