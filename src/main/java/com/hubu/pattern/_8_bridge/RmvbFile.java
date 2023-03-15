package com.hubu.pattern._8_bridge;
/**
 * @Description rmvb视频文件：具体的实现化角色
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/6 20:51
 **/
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
