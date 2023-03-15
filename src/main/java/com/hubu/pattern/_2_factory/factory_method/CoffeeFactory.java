package com.hubu.pattern._2_factory.factory_method;
/**
 * @Description 抽象工厂
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 20:56
 **/
public interface CoffeeFactory {
    // 创建咖啡对象的方法
    Coffee createCoffee();
}
