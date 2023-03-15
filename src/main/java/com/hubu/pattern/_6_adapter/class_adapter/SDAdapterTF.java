package com.hubu.pattern._6_adapter.class_adapter;
/**
 * @Description 适配器类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/5 10:44
 **/
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF(); // 如果我们使用适配器的话，那么真正的读取数据是从TF卡里面去读取。所以，此处我们直接调用TFCardImpl类里面的readTF方法
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg); // 同理，此处我们直接调用TFCardImpl类里面的writeTF方法
    }
}
