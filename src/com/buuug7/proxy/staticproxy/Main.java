package com.buuug7.proxy.staticproxy;

public class Main {
    public static void main(String[] args) {
        StudentProxy studentProxy = new StudentProxy(new Student("Alex"));
        studentProxy.printName();
    }
}
