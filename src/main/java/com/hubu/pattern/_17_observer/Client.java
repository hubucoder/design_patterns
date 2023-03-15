package com.hubu.pattern._17_observer;

public class Client {
    public static void main(String[] args) {
        // 1. 创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();

        // 2. 订阅公众号
        subject.attach(new WeiXinUser("孙悟空"));
        subject.attach(new WeiXinUser("猪悟能"));
        subject.attach(new WeiXinUser("沙悟净"));

        // 3. 公众号更新，发出消息给订阅者（即观察者对象）
        subject.notify("李阿昀的专栏更新了！");
    }
}
