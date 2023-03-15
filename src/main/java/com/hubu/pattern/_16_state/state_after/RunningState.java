package com.hubu.pattern._16_state.state_after;
/**
 * @Description 电梯运行状态类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/13 10:41
 **/
public class RunningState extends LiftState{
    /**
     * 电梯运行的时候开电梯门？你疯了吗！电梯它不会给你开的，所以这里我们什么也不做
     */
    @Override
    public void open() {
        // do nothing
    }

    /**
     * 当电梯处于运行状态时，电梯门本身就是关闭的，所以这里我们什么也不做
     */
    @Override
    public void close() {
        // do nothing
    }

    /**
     * 当前状态下要执行的方法
     *
     * 因为当前电梯本身就处于运行状态，所以run方法就是当前电梯在运行状态下要执行的方法
     */
    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    /**
     * 这个事绝对是合理的，电梯光运行不停止，那还有谁敢坐这个电梯啊？估计只有上帝了
     */
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
