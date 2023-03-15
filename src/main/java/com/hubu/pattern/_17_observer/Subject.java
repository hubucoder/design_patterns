package com.hubu.pattern._17_observer;
/**
 * @Description 抽象主题角色接口
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/14 21:42
 **/
public interface Subject {
    // 添加订阅者（即添加观察者对象）
    void attach(Observer observer);

    // 删除订阅者（即删除观察者对象）
    void detach(Observer observer);

    // 通知订阅者更新消息
    void notify(String message);
}
