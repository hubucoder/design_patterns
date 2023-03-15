package com.hubu.pattern._11_flyweight;

import java.util.HashMap;

public class BoxFactory {
    // 注意，在这儿我们并没有为map成员变量赋值，而是在下面的构造方法中为其进行了初始化操作
    private HashMap<String, AbstractBox> map;

    // 在构造方法中进行初始化操作
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    // 提供一个方法获取该工厂类对象
    public static BoxFactory getInstance() {
        return factory;
    }

    private static BoxFactory factory = new BoxFactory();

    // 根据图形名称获取图形对象
    public AbstractBox getBox(String name) {
        return map.get(name);
    }

}
