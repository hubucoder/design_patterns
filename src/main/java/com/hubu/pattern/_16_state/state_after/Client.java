package com.hubu.pattern._16_state.state_after;

public class Client {
    public static void main(String[] args) {
        // 创建环境角色对象，因为我们之前就已经说过，环境角色就是对外提供访问的接口
        Context context = new Context();
        // 设置当前电梯状态
        context.setLiftState(new RunningState());

        context.open();
        context.close();
        context.run();
        context.stop();

    }
}
