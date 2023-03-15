package com.hubu.pattern._4_builder.demo1;
/**
 * @Description 产品类：要创建的复杂对象
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/3 10:41
 **/
public class Bike {
    private String frame; // 车架
    private String seat; // 车座

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
