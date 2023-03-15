package com.hubu.pattern._11_flyweight;
/**
 * @Description 抽象享元对象
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/7 18:04
 **/
public abstract class AbstractBox {
    // 获取图形的方法
    public abstract String getShape();

    /**
     * 显示图形及颜色
     *
     * 传递外部状态（颜色，即color参数），然后再将其打印出来
     */
    public void display(String color) {
        System.out.println("方块形状：" + getShape() + "，颜色：" + color);
    }
}
