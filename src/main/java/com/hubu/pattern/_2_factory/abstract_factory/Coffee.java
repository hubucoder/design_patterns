package com.hubu.pattern._2_factory.abstract_factory;
/**
 * @Description 咖啡类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/2 10:26
 **/
public abstract class Coffee {
    public abstract String getName();

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
