package com.hubu.pattern._1_singleton.demo5;
/**
 * @Description 懒汉式：静态内部类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 17:06
 **/
public class Singleton {
    // 私有构造方法
    private Singleton() {}

    // 定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton(); // 为了防止外界对该静态属性进行修改，故在其上加了一个final关键字，也即意味着它就是一个常量了
    }

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
