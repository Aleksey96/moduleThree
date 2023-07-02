package oop;

import java.util.stream.Stream;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String nme) {
        this.name = nme;
    }

    public String toString() {
        return "Студент " + name;
    }
}
