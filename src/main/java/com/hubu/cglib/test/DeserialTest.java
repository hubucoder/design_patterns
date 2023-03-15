package com.hubu.cglib.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialTest {
    public static void main(String[] args) {
        Person p;
        try {
            FileInputStream fis = new FileInputStream("Person.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Person) ois.readObject();
            ois.close();
            System.out.println(p.toString());
            System.out.println(p.userName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
