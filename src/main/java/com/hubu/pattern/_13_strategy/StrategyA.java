package com.hubu.pattern._13_strategy;
/**
 * @Description 具体策略类，封装算法
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/9 10:39
 **/
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
