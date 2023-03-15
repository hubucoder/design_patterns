package com.hubu.principles.demo2.before;
/**
 * @Description 正方形类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/4/30 22:36
 **/
public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
