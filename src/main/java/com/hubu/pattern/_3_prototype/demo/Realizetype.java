package com.hubu.pattern._3_prototype.demo;
/**
 * @Description 具体原型类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/2 11:28
 **/
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    /**
     * 重写克隆方法
     * @return 克隆出来的，我们明确肯定是该具体原型类的对象，所以我们应把clone方法的返回值类型改成Realizetype
     * @throws CloneNotSupportedException
     */
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
