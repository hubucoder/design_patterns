package com.hubu.pattern._17_observer;
/**
 * @Description 具体的观察者角色类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/14 21:42
 **/
public class WeiXinUser implements Observer{
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message); // 谁接收到了什么更新的消息
    }
}
