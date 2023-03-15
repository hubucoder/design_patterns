package com.hubu.pattern._15_responsibility;
/**
 * @Description 小组长类：具体的处理者
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/12 11:02
 **/
public class GroupLeader extends Handler{
    public GroupLeader() {
        // 小组长能处理1天以下的请假
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("小组长审批：同意");
    }
}
