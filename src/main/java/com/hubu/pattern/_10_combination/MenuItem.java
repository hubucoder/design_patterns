package com.hubu.pattern._10_combination;
/**
 * @Description 菜单类项：叶子结点
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/7 17:31
 **/
public class MenuItem extends MenuComponent{
    // 提供一个有参构造。我们可以通过该有参构造给菜单项命名以及指定菜单项的一个级别
    public MenuItem(String name, int level) {
        // 为父类中的成员变量进行赋值
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        // 打印菜单项的名称
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
