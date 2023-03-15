package com.hubu.pattern._9_facade;
/**
 * @Description 空调类：子系统
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/6 21:12
 **/
public class AirCondition {
    public void on() {
        System.out.println("打开空调......");
    }

    public void off() {
        System.out.println("关闭空调......");
    }
}
