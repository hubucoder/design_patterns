package com.hubu.pattern._17_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 具体主体角色类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/14 21:43
 **/
public class SubscriptionSubject implements Subject{
    // 定义一个集合，用来存储多个观察者对象
    private List<Observer> weiXinUserList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    /**
     * 不知你有没有想过该方法什么时候执行呢？是不是当微信公众号里面的内容发生变化时，该方法才会执行啊？
     * 而且，当该方法执行时，它会通知所有的观察者对象去自动调用update方法。
     *
     * @param message：通知的内容
     */
    @Override
    public void notify(String message) {
        // 遍历集合
        for (Observer observer : weiXinUserList) {
            // 调用观察者对象中的update方法
            observer.update(message);
        }
    }
}
