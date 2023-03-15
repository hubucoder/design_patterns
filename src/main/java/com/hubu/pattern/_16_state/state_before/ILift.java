package com.hubu.pattern._16_state.state_before;
/**
 * @Description 电梯接口
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/13 10:16
 **/
public interface ILift {
    // 定义四个电梯状态的常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    // 设置电梯状态的功能
    void setState(int state);

    // 电梯操作功能
    void open();

    void close();

    void run();

    void stop();
}
