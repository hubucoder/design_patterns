package com.hubu.principles.demo3.after;

/**
 * 希捷硬盘类
 */
public class XiJieHardDisk implements HardDisk{
    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    @Override
    public String get() {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }
}
