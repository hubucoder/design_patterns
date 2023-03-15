package com.hubu.pattern._18_mediator;
/**
 * @Description 抽象同事类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/16 11:10
 **/
public abstract class Person {
    protected String name; // 租房者或者房主的姓名
    protected Mediator mediator; // 中介者

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
