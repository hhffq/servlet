package com.servlet.servlet;

public class Student extends Person implements Move{
    public Student(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Studnet is moving....");
    }

    @Override
    protected void eat() {
        System.out.println("student is eating...");
    }
}



