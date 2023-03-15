package com.hubu.pattern._18_mediator;

public class MediatorStructure extends Mediator{
    // 聚合房主和租房者对象。为什么要聚合这俩对象呢？因为中介机构必须知道所有房主和租房者的信息！
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        // 中介机构和谁进行沟通，是不是得进行判断一下啊？
        if (person == houseOwner) { // 若中介机构和房主进行沟通，则最终租房者应获得信息
            tenant.getMessage(message);
        } else { // 若中介机构和租房者进行沟通，则最终房主应获得信息
            houseOwner.getMessage(message);
        }
    }
}
