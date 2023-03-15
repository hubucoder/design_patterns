package com.hubu.pattern._18_mediator;

public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        MediatorStructure mediator = new MediatorStructure();

        // 创建租房者对象
        Tenant tenant = new Tenant("李四", mediator);
        // 创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三", mediator);

        // 中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        // 租房者去跟中介沟通，这样中介就会将沟通的信息直接传递给具体的房主，房主就能获取到这个信息了。
        tenant.constact("我要租三室一厅的房子！！！");
        // 房主获取到信息之后，他也得和中介沟通，中介再把沟通的信息告诉给租房者
        houseOwner.constact("我这里有三室一厅的房子，你要租吗？");
    }
}
