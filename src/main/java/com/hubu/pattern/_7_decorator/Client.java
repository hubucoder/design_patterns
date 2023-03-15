package com.hubu.pattern._7_decorator;

import java.io.FileWriter;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        // 点一份炒饭
        FastFood food = new FriedRice();
        // 打印炒饭的价格与描述
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("===================");
        // 在上面的炒饭中加一个鸡蛋
        food = new Egg(food);
        // 打印炒饭加上鸡蛋之后的价格与描述
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("===================");
        // 再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("===================");
        // 再加一个培根
        food = new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
    }
}
