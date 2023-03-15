package com.hubu.pattern._17_observer.jdk;

import java.util.Observable;

/**
 * @Description 小偷类：被观察者对象
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/14 22:01
 **/
public class Thief extends Observable {
    private String name;

    public Thief(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 小偷偷东西的方法
     */
    public void steal() {
        System.out.println("小偷：我偷东西了，有没有人来抓我啊！");
        super.setChanged(); // 将changed标识改为true
        super.notifyObservers(); // 再去通知观察者，此时，观察者里面的update方法才会被执行
    }
}
