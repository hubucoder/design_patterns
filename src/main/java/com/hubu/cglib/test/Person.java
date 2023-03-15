package com.hubu.cglib.test;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 4359709211352400087L;
    public Long id;
    public String name;
    public final String userName;
//    public int age;

    public Person(Long id, String name ){
        this.id = id;
        this.name = name;
        userName = "dddbbb";
//        this.age = age;
    }

//    public String toString() {
//        return id.toString() + "--" + name.toString() + "--" + age;
//    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
//                ", age=" + age +
                '}';
    }
}
