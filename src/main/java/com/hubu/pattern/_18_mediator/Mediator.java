package com.hubu.pattern._18_mediator;
/**
 * @Description 抽象终结者类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/16 11:08
 **/
public abstract class Mediator {
    /**
     * 进行沟通的方法
     * @param message：和中介沟通的信息
     * @param person：Person类是同事类顶层父类，这儿具体是哪个同事类和中介去沟通呢？这个得在具体中介者类中去明确
     */
    public abstract void constact(String message, Person person);
}
