package com.hubu.pattern._4_builder.demo1;
/**
 * @Description ofo 单车构建者，用来构建 ofo 单车
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/3 10:47
 **/
public class OfoBuilder extends Builder{
    /**
     * 构建车架
     */
    @Override
    public void buildFrame() {
        bike.setFrame("ofo铝合金");
    }

    /**
     * 构建车座
     */
    @Override
    public void buildSeat() {
        bike.setFrame("ofo橡胶");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
