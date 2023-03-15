package com.hubu.pattern._14_command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 服务员类：请求者角色
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/11 11:38
 **/
public class Waitor {
    // 请求者可以持有多个命令对象，这是因为一个服务员她可以下多个订单，即发出多个命令
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command cmd) {
        // 将cmd对象存储到List集合中
        commands.add(cmd);
    }

    // 发起命令的功能。这儿，服务员只需喊一声订单来了就行，然后厨师就开始去执行
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了......");
        // 遍历List集合
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
