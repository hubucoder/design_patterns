package com.hubu.pattern._16_state.state_after;
/**
 * @Description 电梯开启状态类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/13 10:40
 **/
public class OpeningState extends LiftState{
    /**
     * 当前状态下要执行的方法
     *
     * 因为当前电梯本身就处于开启状态，所以open方法就是当前电梯在开启状态下要执行的方法
     */
    @Override
    public void open() {
        System.out.println("电梯开启...");
    }

    /**
     * 当电梯处于开启状态时，我们是可以关闭电梯门的
     */
    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSING_STATE); // 记录当前电梯的状态
        // 调用当前电梯状态对象中的Context对象中的close方法。记住，此时调用的是电梯关闭状态对象中的close方法
        super.context.close();
    }

    /**
     * 电梯门不能开着就跑，所以这里我们什么也不做
     */
    @Override
    public void run() {
        // 什么都不做
    }

    /**
     * 电梯处于开启状态时，它本身就是停止的了，所以这里我们什么也不做
     */
    @Override
    public void stop() {
        // 什么都不做
    }
}
