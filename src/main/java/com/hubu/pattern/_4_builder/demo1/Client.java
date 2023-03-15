package com.hubu.pattern._4_builder.demo1;

public class Client {
    public static void main(String[] args) {
        // 创建指挥者对象，此刻我们要生产的是摩拜单车，所以在Director类的有参构造中我们传入的是MobileBuilder对象
        Director director = new Director(new MobileBuilder());
        // 让指挥者指挥组装自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
