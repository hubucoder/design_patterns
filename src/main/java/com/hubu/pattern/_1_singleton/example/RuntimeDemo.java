package com.hubu.pattern._1_singleton.example;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description 单例模式在JDK中的体现
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/1 18:13
 **/
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();
        // 调用runtime对象的exec方法，参数要的是一个命令
        Process process = runtime.exec("ipconfig");
        // 调用process对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100]; // 定义的字节数组比较大，因为我们想一次性把数据全部给它读进来
        // 读取数据
        int len = is.read(arr); // 返回读到的字节的个数
        // 将字节数组转换为字符串并输出到控制台
        System.out.println(new String(arr, 0, len, "GBK"));
    }
}
