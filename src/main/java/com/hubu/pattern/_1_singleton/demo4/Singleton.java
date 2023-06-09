package com.hubu.pattern._1_singleton.demo4;
/**
 * @Description 懒汉式：双重检查
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 16:57
 **/
public class Singleton {
    // 私有构造方法
    private Singleton() {}

    // 声明Singleton类型的变量
    private static volatile Singleton instance;

    // 对外提供公共的访问方式
    public static Singleton getInstance() {
        // 第一次判断，如果instance的值不为null，那么就不需要抢占锁了，直接返回对象即可
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
