package com.hubu.pattern._3_prototype.test.extension.Shallow_clone;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象
        Citation citation = new Citation();
        // 创建学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        // 2. 克隆奖状对象
        Citation citation1 = citation.clone();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        // 3. 调用show方法展示
        citation.show();
        citation1.show();
    }
}
