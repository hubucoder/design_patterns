package com.hubu.pattern._1_singleton.demo3;
/**
 * @Description 懒汉式：线程不安全
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 16:45
 **/
public class Singleton {
    // 私有构造方法
    private Singleton() {}

    // 声明Singleton类型的变量instance
    private static Singleton instance; // 只是声明了一个该类型的变量，并没有对其进行赋值

    // 对外提供访问方式
    public static synchronized Singleton getInstance() {
        // 判断instance是否为null，如果为null，那么说明还没有创建Singleton类的对象
        // 如果没有创建的话，那么我们就创建一个并返回；如果有创建，那么直接返回即可
        if (instance == null) {
            // 线程1等待，线程2获取到cpu的执行权，也会进入到该判断里面,为了线程安全，加上 synchronized 关键字
            instance = new Singleton();
        }
        return instance;
    }
}
