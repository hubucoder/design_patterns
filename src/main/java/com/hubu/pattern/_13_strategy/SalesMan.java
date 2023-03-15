package com.hubu.pattern._13_strategy;
/**
 * @Description 促销员类：环境类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/9 10:42
 **/
public class SalesMan {
    // 聚合策略接口对象
    private Strategy strategy;

    // 通过以下有参构造为上面定义的成员变量赋值（即设置具体策略类对象）
    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 由促销员展示促销活动给用户
    public void salesManShow() {
        strategy.show();
    }
}
