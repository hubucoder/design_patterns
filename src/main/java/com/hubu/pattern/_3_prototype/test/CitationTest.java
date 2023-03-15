package com.hubu.pattern._3_prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象
        Citation citation = new Citation();
        citation.setName("张三"); // 假设这张奖状是张三的

        // 2. 克隆奖状对象
        Citation citation1 = citation.clone();
        citation1.setName("李四"); // 克隆出来的这张奖状是李四的

        // 3. 调用show方法展示奖状
        citation.show();
        citation1.show();
    }
}
