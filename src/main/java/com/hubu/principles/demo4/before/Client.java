package com.hubu.principles.demo4.before;

public class Client {
    public static void main(String[] args) {
        HubuSafetyDoor door = new HubuSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
