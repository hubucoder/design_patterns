package com.hubu.pattern._17_observer.jdk;

public class Client {
    public static void main(String[] args) {
        // 创建小偷对象
        Thief thief = new Thief("吕泽洋");
        // 创建警察对象
        PoliceMen policemen = new PoliceMen("老李");
        // 让警察盯着小偷
        thief.addObserver(policemen);
        // 小偷偷东西
        thief.steal();
    }
}
