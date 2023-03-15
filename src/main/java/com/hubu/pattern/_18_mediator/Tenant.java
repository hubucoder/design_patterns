package com.hubu.pattern._18_mediator;
/**
 * @Description 具体的同事角色类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/16 11:11
 **/
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介联系（沟通）
    public void constact(String message) {
        mediator.constact(message, this); // 这儿究竟是谁和中介去沟通呢？肯定是当前类的对象，是不是啊！所以这儿直接把this传递进来就可以了
    }

    /**
     * 获取信息
     * @param message：房主反馈回来的信息
     */
    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息是：" + message);
    }
}
