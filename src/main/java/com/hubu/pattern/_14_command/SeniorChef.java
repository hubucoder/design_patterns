package com.hubu.pattern._14_command;
/**
 * @Description 厨师类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/11 11:35
 **/
public class SeniorChef {
    // 制作食物的功能
    public void makeFood(String name, int num) {
        System.out.println(num + "份" + name); // 这儿输出的是多少份什么食物
    }
}
