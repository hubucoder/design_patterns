package com.hubu.pattern._16_state.state_after;

/**
 * @Description 电梯停止状态类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/13 10:44
 **/
public class StoppingState extends LiftState {
    /**
     * 当电梯处于停止状态时，我们是可以开电梯门的
     */
    @Override
    public void open() {
        // 状态修改
        super.context.setLiftState(Context.OPENING_STATE);
        /*
         * 委托给OpeningState类来执行开电梯门这个动作
         *
         * 当然了，以下代码你也可以替换为：super.context.open();
         */
        super.context.getLiftState().open();
    }

    /**
     * 当电梯处于停止状态时，我们也是可以关电梯门的
     */
    @Override
    public void close() {
        // 状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        /*
         * 委托给ClosingState类来执行关电梯门这个动作
         *
         * 当然了，以下代码你也可以替换为：super.context.close();
         */
        super.context.getLiftState().close();
    }

    /**
     * 电梯由停止状态再跑起来，正常的很
     */
    @Override
    public void run() {
        // 状态修改
        super.context.setLiftState(Context.RUNNING_STATE);
        /*
         * 委托给RunningState类来执行运行电梯这个动作
         *
         * 当然了，以下代码你也可以替换为：super.context.run();
         */
        super.context.getLiftState().run();
    }

    /**
     * 当前状态下要执行的方法
     *
     * 因为当前电梯本身就处于停止状态，所以stop方法就是当前电梯在停止状态下要执行的方法
     */
    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
