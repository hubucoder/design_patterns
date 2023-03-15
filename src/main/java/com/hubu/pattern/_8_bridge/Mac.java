package com.hubu.pattern._8_bridge;
/**
 * @Description Mac 操作系统：扩展抽象画角色
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/6 20:49
 **/
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
