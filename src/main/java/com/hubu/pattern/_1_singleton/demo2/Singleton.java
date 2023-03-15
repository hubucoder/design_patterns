package com.hubu.pattern._1_singleton.demo2;
/**
 * @Description 饿汉式：静态代码块
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 16:36
 **/
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    // 声明Singleton类型的变量
    private static Singleton instance;

    // 在静态代码块中进行赋值
    static {
        instance = new Singleton();
    }

    // 对外提供获取该类对象的方法
    public static Singleton getInstance() {
        return instance;
    }
}
