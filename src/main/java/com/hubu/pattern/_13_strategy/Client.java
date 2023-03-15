package com.hubu.pattern._13_strategy;

import java.nio.channels.Channel;
import java.util.Arrays;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        // 春节来了，使用春节促销活动
        // 创建促销员类对象，注意，在创建的时候必须传递具体的促销活动对象
        SalesMan salesMan = new SalesMan(new StrategyA());
        // 促销员开始展示促销活动
        salesMan.salesManShow();

        System.out.println("=========================");
        // 中秋节到了，使用中秋节的促销活动
        salesMan.setStrategy(new StrategyB());
        // 促销员开始展示促销活动
        salesMan.salesManShow();

        System.out.println("=========================");
        // 圣诞节到了，使用圣诞节的促销活动
        salesMan.setStrategy(new StrategyC());
        // 促销员开始展示促销活动
        salesMan.salesManShow();
    }
}
