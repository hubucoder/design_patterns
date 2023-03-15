package com.hubu.pattern._6_adapter.object_adapter;

/**
 * @Description 适配者类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/5 10:33
 **/
public class TFCardImpl implements TFCard {
    /*
     * 注意，这里只是模拟从TF卡里面读取数据
     */
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello world TFCard";
        return msg;
    }

    /*
     * 往TF卡里面写数据时，我们是直接将拿到的数据输出到了控制台
     */
    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
