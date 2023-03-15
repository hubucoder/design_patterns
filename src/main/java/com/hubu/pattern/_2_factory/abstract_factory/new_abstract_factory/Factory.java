package com.hubu.pattern._2_factory.abstract_factory.new_abstract_factory;



/**
 * 使用简单工厂配合反射，替代抽象工厂
 */
public class Factory {
    public static Coffee createCoffee(String name) throws Exception {
        return (Coffee) Class.forName(name).newInstance();
    }

    public static Dessert createDessert(String name) throws Exception {
        return (Dessert) Class.forName(name).newInstance();
    }
}
