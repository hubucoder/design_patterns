package com.hubu.pattern._4_builder.demo1;
/**
 * @Description 具体的构建者，用来构建摩拜单车对象
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/3 10:46
 **/
public class MobileBuilder extends Builder{
    /**
     * 构建车架
     */
    @Override
    public void buildFrame() {
        bike.setFrame("Mobile碳钎维");
    }

    /**
     * 构建车座
     */
    @Override
    public void buildSeat() {
        bike.setSeat("Mobile真皮");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
