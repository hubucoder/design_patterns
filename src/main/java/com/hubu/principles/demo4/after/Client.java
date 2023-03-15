package com.hubu.principles.demo4.after;

public class Client {
    public static void main(String[] args) {
        // 创建自定义安全门对象
        HubuSafetyDoor door = new HubuSafetyDoor();
        // 调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        System.out.println("===================");
        // 创建阿昀安全门对象
        ChangChengSafetyDoor door1 = new ChangChengSafetyDoor();
        // 调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
