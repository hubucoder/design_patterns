package com.hubu.pattern._9_facade;

public class Client {
    public static void main(String[] args) {
        // 创建智能音箱对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        // 控制家电
        facade.say("打开家电"); // 早上起来时，喊一声"打开家电"，那么所有的家电都会打开
        System.out.println("==========================");
        facade.say("关闭家电"); // 晚上睡觉时，喊一声"关闭家电"，那么所有的家电都会关闭
    }
}
