package com.hubu.pattern._5_proxy.static_proxy;
/**
 * @Description 火车站类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/4 13:41
 **/
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
