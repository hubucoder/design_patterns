package com.hubu.pattern._8_bridge;
/**
 * @Description avi 视频文件：具体的实现化角色
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/6 20:42
 **/
public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
