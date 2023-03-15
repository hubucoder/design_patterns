package com.hubu.pattern._15_responsibility;
/**
 * @Description 总经理类（具体的处理者）
 * @Author wanght 
 * @Email wanght.w@outlook.com
 * @Date 2022/5/12 11:04 
 **/
public class GeneralManager extends Handler{
    public GeneralManager() {
        // 总经理能处理3-7天的请假
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("总经理审批：同意");
    }
}
