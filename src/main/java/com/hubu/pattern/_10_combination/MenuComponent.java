package com.hubu.pattern._10_combination;
/**
 * @Description 菜单组件：属于抽象根节点
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/7 17:28
 **/
public abstract class MenuComponent {
    // 菜单组件的名称
    protected String name;
    // 菜单组件的层级
    protected int level;

    /**
     * 添加子菜单或者子菜单项，也就是说既可以添加菜单，也可以添加菜单项
     *
     * 大家一定要注意，如果是菜单的话，那么可以调用该方法，因为菜单下面是可以有子菜单或者子菜单项的；
     * 但是，如果是菜单项的话，那么就不能调用该方法了，因为对于菜单项来说，它下面是不可以再有子菜
     * 单或者子菜单项的，所以在菜单组件里面，我们给该方法一个默认的实现，即抛出一个不支持的操作的异常。
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除子菜单或者子菜单项
     *
     * 大家一定要注意，如果是菜单的话，那么它底下是可以有子菜单或者子菜单项的，所以就可以移除了；
     * 而如果是菜单项的话，那么它便没有该移除操作了，所以在这儿我们也是抛了一个不支持的操作的异常。
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取指定的子菜单
     *
     * 大家一定要注意，如果是菜单的话，那么可以调用该方法；而如果是菜单项的话，那么就不能调用该方法了，
     * 所以在这儿我们也是默认抛了一个不支持的操作的异常。
     */
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单或者菜单项的名称
    public String getName() {
        return name;
    }

    /**
     * 打印菜单名称（包含子菜单和子菜单项）
     *
     * 对于菜单和菜单项来说，print方法的实现是不一样的，所以在这里我们就把它定义成抽象方法了。
     */
    public abstract void print();
}
