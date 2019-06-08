package com.buuug7.proxy.dynamicproxy;

public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }
}
