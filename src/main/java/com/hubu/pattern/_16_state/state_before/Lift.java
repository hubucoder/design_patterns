package com.hubu.pattern._16_state.state_before;

/**
 * @Description 电梯类：ILift接口的子实现类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/13 10:18
 **/
public class Lift implements ILift {

    // 声明一个记录当前电梯状态的成员变量
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) { // 判断当前电梯的状态
            case OPENING_STATE:
                // 如果当前电梯正处于开启状态，那么我们再去开门，这就没有任何意义了，所以这儿我们什么事都不做
                break;
            case CLOSING_STATE:
                // 如果当前电梯正处于关闭状态，那么我们就能开电梯门了
                System.out.println("电梯打开了...");
                // 设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                // 如果当前电梯正处于停止状态，那么我们也是能开电梯门的
                System.out.println("电梯打开了...");
                // 设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                // 如果当前电梯正处于运行状态，那么我们肯定是不能去开门的，因为电梯运行时是不能开门的，所以这儿我们什么事都不做
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                // 如果当前电梯正处于开启状态，那么我们就能关闭电梯门了
                System.out.println("电梯关门了...");
                // 设置当前电梯状态为关闭状态
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                // 如果当前电梯正处于关闭状态，那么我们再去关门，这就没有任何意义了，所以这儿我们什么事都不做
                // do nothing
                break;
            case RUNNING_STATE:
                // 如果当前电梯正处于运行状态，很显然，此时电梯门肯定是关着的，那么我们就不能再去关门了，所以这儿我们什么事都不做
                // do nothing
                break;
            case STOPPING_STATE:
                // 如果当前电梯正处于停止状态，很显然，此时电梯门肯定也是关着的，那么我们就不能再去关门了，所以这儿我们什么事都不做
                // do nothing
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                // 如果当前电梯正处于开启状态，那么我们肯定是不能让电梯运行的，因为电梯不能开着门就走，所以这儿我们什么事都不做
                // do nothing
                break;
            case CLOSING_STATE:
                // 如果当前电梯正处于关闭状态，那么我们就能让电梯运行了
                System.out.println("电梯开始运行了...");
                // 设置当前电梯状态为运行状态
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                // 如果当前电梯正处于运行状态，那么我们再去运行电梯，这就没有任何意义了，所以这儿我们什么事都不做
                // do nothing
                break;
            case STOPPING_STATE:
                // 如果当前电梯正处于停止状态，那么我们也是可以让电梯运行的
                System.out.println("电梯开始运行了...");
                // 设置当前电梯状态为运行状态
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                // 如果当前电梯正处于开启状态，那么我们再让电梯停止下来，就没有必要了，因为开门的电梯已经是停止的了（正常情况下），所以这儿我们什么事都不做
                // do nothing
                break;
            case CLOSING_STATE:
                // 如果当前电梯正处于关闭状态，那么我们就能让电梯停止下来了，因为电梯关门时才可以停止
                System.out.println("电梯停止了...");
                // 设置当前电梯状态为停止状态
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                // 如果当前电梯正处于运行状态，那么我们也是能让电梯停止的，因为电梯运行时本身就可以停止啊
                System.out.println("电梯停止了...");
                // 设置当前电梯状态为停止状态
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                // 如果当前电梯正处于停止状态，那么我们再去让电梯停止下来，这就没有任何意义了，所以这儿我们什么事都不做
                // do nothing
                break;
        }
    }

}

