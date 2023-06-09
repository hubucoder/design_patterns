package com.hubu.pattern._6_adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);


        System.out.println("=======================");
        // 使用该电脑读取TF卡中的数据
        String msg1 = computer.readSD(new SDAdapterTF()); // 创建适配器类对象，并进行一个传递
        System.out.println(msg1);
    }
}
