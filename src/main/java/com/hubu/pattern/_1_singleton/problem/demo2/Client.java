package com.hubu.pattern._1_singleton.problem.demo2;

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1. 获取Singleton类的字节码对象
        Class clazz = Singleton.class;
        // 2. 获取Singleton类的私有无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        // 3. 取消访问检查
        cons.setAccessible(true);
        // 4. 通过反射的方式创建Singleton对象
        Singleton s1 = (Singleton) cons.newInstance();
        Singleton s2 = (Singleton) cons.newInstance();
        System.out.println(s1 == s2); // 如果返回的是true，那么说明并没有破坏单例模式；如果是false，那么说明破坏了单例模式
    }
}
