package com.hubu.pattern._7_decorator;
/**
 * @Description 培根类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/5 12:18
 **/
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
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
