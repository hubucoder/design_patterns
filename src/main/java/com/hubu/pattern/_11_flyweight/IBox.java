package com.hubu.pattern._11_flyweight;
/**
 * @Description I 图形类：具体享元角色
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/7 18:07
 **/
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
