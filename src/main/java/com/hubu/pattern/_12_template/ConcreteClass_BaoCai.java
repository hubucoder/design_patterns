package com.hubu.pattern._12_template;
/**
 * @Description 炒包菜类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/8 10:49
 **/
public class ConcreteClass_BaoCai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
