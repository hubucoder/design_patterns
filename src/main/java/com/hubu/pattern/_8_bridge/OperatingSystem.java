package com.hubu.pattern._8_bridge;
/**
 * @Description 抽象的操作系统类：抽象画角色
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/6 20:45
 **/
public abstract class OperatingSystem {
    // 声明VideoFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
