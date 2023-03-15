package com.hubu.pattern._1_singleton.problem.demo1;

import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
//        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    // 从文件中读取数据
    public static void readObjectFromFile() throws Exception {
        // 1. 创建对象输入流对象
        File file = new File("a.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        // 2. 读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        // 3. 释放资源
        ois.close();
    }

    // 向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        // 1. 获取Singleton对象
        Singleton instance = Singleton.getInstance();
        // 2. 创建对象输出流对象
        File file = new File("a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        // 3. 写对象
        oos.writeObject(instance);
        // 4. 释放资源
        oos.close();
    }
}
