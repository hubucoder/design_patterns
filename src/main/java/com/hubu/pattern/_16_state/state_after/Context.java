package com.hubu.pattern._16_state.state_after;

import java.util.Arrays;

public class Context {
    // 定义对应电梯状态类对象的常量
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StoppingState STOPPING_STATE = new StoppingState();

    // 定义一个记录当前电梯状态的变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    // 设置当前电梯状态对象
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        // 设置完当前电梯状态对象之后，别忘了，我们还得设置当前电梯状态对象中的Context对象
        this.liftState.setContext(this); // 现在我们就在Context类中，所以在setContext方法里面直接传递this就可以了
    }

    // 以下是四个操作电梯状态的方法，在这些方法里面我们都是直接去调用当前电梯状态对象里面各自对应的方法
    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

}
