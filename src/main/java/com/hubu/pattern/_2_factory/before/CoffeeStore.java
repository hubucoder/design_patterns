package com.hubu.pattern._2_factory.before;
/**
 * @Description 咖啡店
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 19:52
 **/
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        // 声明Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
