package com.hubu.pattern._1_singleton.problem.demo1;

import java.io.Serializable;
/**
 * @Description 序列化破坏单例模式：以静态内部类方式演示
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 17:22
 **/
public class Singleton implements Serializable {
    // 私有构造方法
    private Singleton() {}

    // 定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 当进行反序列化时，会自动调用该方法，并将该方法的返回值直接返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
