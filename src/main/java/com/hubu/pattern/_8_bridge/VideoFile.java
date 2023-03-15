package com.hubu.pattern._8_bridge;
/**
 * @Description 视频文件：实现化角色
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/6 20:40
 **/
public interface VideoFile {
    // 解码功能
    void decode(String fileName);
}
