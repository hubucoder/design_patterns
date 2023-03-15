package com.hubu.pattern._8_bridge;

public class Client {
    public static void main(String[] args) {
        // 创建Mac操作系统对象，注意，在创建时我们还得传递一个具体实现化角色对象，也就是告诉操作系统应播放什么格式的视频文件
        OperatingSystem system = new Mac(new AviFile());
        // 使用操作系统播放视频文件
        system.play("战狼3");
    }
}
