package com.hubu.pattern._17_observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description 警察类：观察者对象
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/14 22:02
 **/
public class PoliceMen implements Observer {

    private String name;

    public PoliceMen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("警察：" + ((Thief) o).getName() + "，我已经盯你很久了，你可以保持沉默，但你所说的将成为呈堂证供！");
    }
}
