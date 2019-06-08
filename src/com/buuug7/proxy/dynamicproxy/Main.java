package com.buuug7.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Alex");
        LogProxy logProxy = new LogProxy(student);
        Person person = (Person) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                student.getClass().getInterfaces(),
                logProxy);
        person.printName();
    }
}
