package com.hubu.principles.demo3.before;

public class Computer {
    private XiJieHardDisk xiJieHardDisk;
    private InterCPU interCPU;
    private KingstonMemory kingstonMemory;

    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public InterCPU getInterCPU() {
        return interCPU;
    }

    public void setInterCPU(InterCPU interCPU) {
        this.interCPU = interCPU;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public void run () {
        System.out.println("运行计算机");
        // 计算机运行时，各个配件应各司其职，干自己的活
        String data = xiJieHardDisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        interCPU.run();
        kingstonMemory.save();
    }
}
