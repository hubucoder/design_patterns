package com.hubu.pattern._16_state.state_before;
/**
 * @Description 测试类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/13 10:18
 **/
public class Client {
    public static void main(String[] args) {
        // 创建电梯对象
        Lift lift = new Lift();

        // 设置当前电梯的状态
//        lift.setState(ILift.OPENING_STATE);

        lift.setState(ILift.RUNNING_STATE);
        // 打开
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
