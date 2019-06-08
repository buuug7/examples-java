package com.buuug7.proxy.staticproxy;

public class StudentProxy implements Person {

    private Student student;

    public StudentProxy(Student student) {
        this.student = student;
    }


    @Override
    public void printName() {
        // some proxy operations
        System.out.println("proxy operations");
        student.printName();
    }
}
