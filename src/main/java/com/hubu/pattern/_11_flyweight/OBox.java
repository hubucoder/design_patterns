package com.hubu.pattern._11_flyweight;
/**
 * @Description O 图形类：具体享元角色
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/7 18:08
 **/
public class OBox extends AbstractBox{
    @Override
    public String getShape() {
        return "O";
    }
}
