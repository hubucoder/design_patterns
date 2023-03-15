package com.hubu.principles.demo1;
/**
 * @Description 测试类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/4/30 22:06
 **/
public class Client {
    public static void main(String[] args) {
        // 1. 创建搜狗输入法对象
        SougouInput input = new SougouInput();
        // 2. 创建皮肤对象
        // DefaultSkin skin = new DefaultSkin();
        MeimeixiaSkin skin = new MeimeixiaSkin();
        // 3. 将皮肤设置到输入法中
        input.setSkin(skin);
        // 4. 显示皮肤
        input.display();
    }
}
