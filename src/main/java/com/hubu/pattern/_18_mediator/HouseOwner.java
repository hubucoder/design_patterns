package com.hubu.pattern._18_mediator;
/**
 * @Description 具体同事角色类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/16 11:13
 **/
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介联系（沟通）
    public void constact(String message) {
        mediator.constact(message, this); // 这儿究竟是谁和中介去沟通呢？肯定是当前类的对象，是不是啊！所以这儿直接把this传递进来就可以了
    }

    /**
     * 获取信息
     * @param message：租房者反馈回来的信息
     */
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息是：" + message);
    }
}
