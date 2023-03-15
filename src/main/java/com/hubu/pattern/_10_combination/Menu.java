package com.hubu.pattern._10_combination;

import java.util.ArrayList;
import java.util.List;
/**
 * @Description 菜单类：树枝节点
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/7 17:30
 **/
public class Menu extends MenuComponent{
    // 因为菜单可以有多个子菜单或者子菜单项，所以在这儿我们声明一个private修饰的List集合，而且List集合里面存储的还要是MenuComponent
    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    // 提供一个有参构造。我们可以通过该有参构造给菜单命名以及指定菜单的一个级别
    public Menu(String name, int level) {
        // 为父类中的成员变量进行赋值
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        // 打印菜单名称
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        // 打印子菜单或者子菜单项名称
        for (MenuComponent component : menuComponentList) {
            component.print();
        }
    }
}
