package org.example;

public class Human {

    private String name;
    private String salary;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    public int getSalary() {
        return 0;
    }
}
