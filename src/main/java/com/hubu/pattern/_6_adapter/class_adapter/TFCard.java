package com.hubu.pattern._6_adapter.class_adapter;
/**
 * @Description 适配者的类接口
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/5 10:32
 **/
public interface TFCard {
    // 从TF卡中读取数据
    String readTF();
    // 往TF卡中写数据
    void writeTF(String msg);
}
