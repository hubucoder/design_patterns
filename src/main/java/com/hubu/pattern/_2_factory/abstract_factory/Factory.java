package com.hubu.pattern._2_factory.abstract_factory;
/**
 * @Description 甜点工厂接口
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/2 10:33
 **/
public interface Factory {

    // 生产咖啡的功能
    Coffee createCoffee();

    // 生产甜品的功能
    Dessert createDessert();

}
