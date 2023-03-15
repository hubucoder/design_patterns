package com.hubu.pattern._11_flyweight;

public class Client {
    public static void main(String[] args) {
        // 获取I图形对象
        AbstractBox box1 = BoxFactory.getInstance().getBox("I");
        // 为I图形传递（或者设置）颜色
        box1.display("灰色");

        // 获取L图形对象
        AbstractBox box2 = BoxFactory.getInstance().getBox("L");
        // 为L图形传递（或者设置）颜色
        box2.display("绿色");

        // 获取O图形对象
        AbstractBox box3 = BoxFactory.getInstance().getBox("O");
        // 为O图形传递（或者设置）颜色
        box3.display("灰色");

        // 再获取O图形对象
        AbstractBox box4 = BoxFactory.getInstance().getBox("O");
        // 为O图形传递（或者设置）颜色
        box4.display("红色");

        System.out.println("两次获取到的O图形对象是否是同一个对象：" + (box3 == box4));
    }
}
