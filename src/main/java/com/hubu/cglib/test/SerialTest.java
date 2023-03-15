package com.hubu.cglib.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialTest {
    public static void main(String[] args) {
        Person p = new Person(1L, "wanght");
        System.out.println("person Seria:" + p);
        try {
            FileOutputStream fos = new FileOutputStream("Person.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
