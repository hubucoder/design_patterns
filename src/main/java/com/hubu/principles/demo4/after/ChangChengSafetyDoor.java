package com.hubu.principles.demo4.after;

public class ChangChengSafetyDoor implements AntiTheft, Fireproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }
}
