package com.hubu.principles.demo2.before;
/**
 * @Description 测试类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/4/30 22:37
 **/
public class RectangleTest {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle r = new Rectangle();
        // 设置长和宽
        r.setLength(20);
        r.setWidth(10);
        // 调用resize方法进行扩宽
        resize(r);
        printLengthAndWidth(r);

        System.out.println("=============================");
        // 创建正方形对象
        Square s = new Square();
        // 设置长和宽
        s.setLength(10);
        // 调用resize方法进行扩宽
        resize(s);
        printLengthAndWidth(s);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，那么则进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
