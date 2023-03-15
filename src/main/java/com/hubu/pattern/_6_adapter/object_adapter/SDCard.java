package com.hubu.pattern._6_adapter.object_adapter;
/**
 * @Description 目标接口
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/5 10:35
 **/
public interface SDCard {
    // 从SD卡中读取数据
    String readSD();
    // 往SD卡中写数据
    void writeSD(String msg);
}
