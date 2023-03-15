package com.hubu.pattern._4_builder.demo1;
/**
 * @Description 指挥者类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/3 10:49
 **/
public class Director {
    // 声明Builder类型的变量
    private Builder builder; // 在去创建Director对象的时候再为其赋值，所以在Director类里面我们得提供一个有参构造

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车的功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
