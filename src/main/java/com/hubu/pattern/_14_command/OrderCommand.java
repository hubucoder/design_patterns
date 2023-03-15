package com.hubu.pattern._14_command;

import java.util.Map;
import java.util.Set;
/**
 * @Description 具体命令类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/11 11:37
 **/
public class OrderCommand implements Command{
    // 具体命令类通常会持有接收者对象
    private SeniorChef receiver;
    // 此外，具体命令类还得持有订单对象，因为要让厨师去做菜，还得告诉他需要做哪些菜
    private Order order;

    // 提供一个有参构造方法为以上两个成员变量赋值
    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        // 发送命令，让厨师去做订单里面的菜...
        Map<String, Integer> foodDic = order.getFoodDic();
        // 遍历Map集合
        Set<String> keys = foodDic.keySet();
        for (String foodName : keys) {
            receiver.makeFood(foodName, foodDic.get(foodName));
        }

        System.out.println(order.getDiningTable() + "桌的饭准备完毕！！！");
    }
}
