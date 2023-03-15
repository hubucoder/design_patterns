package com.hubu.principles.demo3.after;

public class ComputerTest {
    public static void main(String[] args) {
        // 创建计算机的配件对象
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        // 创建计算机对象
        Computer c = new Computer();
        // 组装计算机
        c.setCpu(cpu);
        c.setHardDisk(hardDisk);
        c.setMemory(memory);

        // 运行计算机
        c.run();
    }
}