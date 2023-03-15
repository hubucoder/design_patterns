package com.hubu.pattern._3_prototype.test.extension.Deep_cloning;

import java.io.*;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // 创建原型对象
        Citation citation = new Citation();
        // 创建学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
        // 写对象
        oos.writeObject(citation);
        // 释放资源
        oos.close();

        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
        // 读取对象
        Citation citation1 = (Citation) ois.readObject();
        // 释放资源
        ois.close();


        // 克隆奖状对象
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        // 调用show方法展示
        citation.show();
        citation1.show();
    }
}
