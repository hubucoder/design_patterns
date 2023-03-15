package com.hubu.pattern._16_state.state_after;

/**
 * @Description 电梯关闭状态类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/13 10:44
 **/
public class ClosingState extends LiftState {
    /**
     * 当前状态下要执行的方法
     *
     * 因为当前电梯本身就处于关闭状态，所以close方法就是当前电梯在关闭状态下要执行的方法
     */
    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    /**
     * 电梯门关了再打开，这是允许的
     */
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    /**
     * 电梯门关了就跑，这是再正常不过的了
     */
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    /**
     * 电梯门关着，我就是不按楼层，你能怎么着我
     */
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
