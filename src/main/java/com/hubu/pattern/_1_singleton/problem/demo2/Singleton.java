package com.hubu.pattern._1_singleton.problem.demo2;
/**
 * @Description 反射破坏单例模式：静态内部类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 17:36
 **/
public class Singleton {

    private static boolean flag = false;

    private Singleton() {
        // 判断flag的值是否为true，若是true，则说明非第一次访问，直接抛一个异常，若是false，则说明第一次访问，就让该私有构造方法正常的去创建对象即可
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            // 将flag的值设置为true
            flag = true;
        }
    }

//    // 私有构造方法
//    private Singleton() {}

    // 定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
