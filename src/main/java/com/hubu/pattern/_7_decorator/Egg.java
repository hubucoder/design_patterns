package com.hubu.pattern._7_decorator;
/**
 * @Description 鸡蛋类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/5 12:18
 **/
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        // 计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
