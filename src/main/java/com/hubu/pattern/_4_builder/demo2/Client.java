package com.hubu.pattern._4_builder.demo2;

public class Client {
    public static void main(String[] args) {
        // 创建手机对象   通过构建者对象获取手机对象
        Phone phone = new Phone.Builder()
                .cpu("intel") // 由于cpu、screen等这些方法返回的都是当前对象，所以我们就可以使用链式编程了
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();
        System.out.println(phone);
    }
}
