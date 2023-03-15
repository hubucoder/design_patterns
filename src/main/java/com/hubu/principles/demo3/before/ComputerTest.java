package com.hubu.principles.demo3.before;

public class ComputerTest {
    public static void main(String[] args) {
        // 创建配件
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        InterCPU interCPU = new InterCPU();
        KingstonMemory kingstonMemory = new KingstonMemory();

        // 创建计算机对象
        Computer computer = new Computer();

        // 组装计算机
        computer.setXiJieHardDisk(xiJieHardDisk);
        computer.setInterCPU(interCPU);
        computer.setKingstonMemory(kingstonMemory);

        // 运行计算机
        computer.run();
    }
}
