package com.hubu.pattern._2_factory.factory_method.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 单列集合里面获取迭代器的方法，即Collection.iterator，底层用的就是工厂方法模式
 * @Author wanght 
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 21:09
 **/
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("任我行");

        // 获取迭代器对象
        Iterator<String> it = list.iterator();
        // 使用迭代器遍历
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
