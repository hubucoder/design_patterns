package com.hubu.pattern._17_observer;
/**
 * @Description 主题推送的内容
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/14 21:41
 **/
public interface Observer {
    /**
     * @param message：主题推送的内容
     */
    void update(String message);
}
