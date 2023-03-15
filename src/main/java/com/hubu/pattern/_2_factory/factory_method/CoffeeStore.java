package com.hubu.pattern._2_factory.factory_method;
/**
 * @Description 咖啡店
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 21:02
 **/
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    // 点咖啡功能。注意，这儿不再需要创建具体工厂对象了，而是会从客户端传递进来
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
