package com.hubu.pattern._6_adapter.class_adapter;
/**
 * @Description 具体的 SD 卡类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/5 10:36
 **/
public class SDCardImpl implements SDCard {
    /*
     * 注意，这里只是模拟从SD卡里面读取数据
     */
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello world SD";
        return msg;
    }

    /*
     * 往SD卡里面写数据时，我们是直接将拿到的数据输出到了控制台
     */
    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
