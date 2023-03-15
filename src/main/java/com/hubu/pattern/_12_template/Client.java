package com.hubu.pattern._12_template;

public class Client {
    public static void main(String[] args) {
        // 现在我们来炒个包菜
        // 创建对象
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        // 调用炒菜的功能
        baoCai.cookProcess();
    }
}
