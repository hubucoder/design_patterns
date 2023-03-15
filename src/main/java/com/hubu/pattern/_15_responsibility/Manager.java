package com.hubu.pattern._15_responsibility;
/**
 * @Description 部门经理：具体处理者
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/12 11:03
 **/
public class Manager extends Handler{
    public Manager() {
        // 部门经理能处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("部门经理审批：同意");
    }
}
