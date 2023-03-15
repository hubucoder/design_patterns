package com.hubu.principles.demo1;
/**
 * @Description 搜狗输入法
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/4/30 22:06
 **/
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
