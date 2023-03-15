package com.hubu.pattern._9_facade;
/**
 * @Description 外观类，用户主要和该类对象进行交互
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/6 21:14
 **/
public class SmartAppliancesFacade {
    // 聚合电灯对象、电视机对象、空调对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    /*
     * 以上只是声明了三个成员变量，但是它们都还未赋值具体的对象，所以我们可以在SmartAppliancesFacade类
     * 中定义一个如下的无参的构造方法，在该无参构造里面为它们赋值
     */
    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    // 通过语音控制
    public void say(String message) {
        if (message.contains("打开")) { // 若用户说的语言里面包含了打开这样的一个字眼，则调用on方法一键打开所有智能家电
            on();
        } else if (message.contains("关闭")) { // 若用户说的语言里面包含了关闭这样的一个字眼，则调用off方法一键关闭所有智能家电
            off();
        } else {
            System.out.println("我还听不懂你说的！！！");
        }
    }

    // 一键打开功能
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    // 一键关闭功能
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
