package com.bilgeadam.empoyeeprj.entity;

public class Employee {

    private String name;
    private int age;
    private String desiganiton;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesiganiton() {
        return desiganiton;
    }

    public void setDesiganiton(String desiganiton) {
        this.desiganiton = desiganiton;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desiganiton='" + desiganiton + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void printEmployee() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getDesiganiton());
        System.out.println(getSalary());
        System.out.println("----------------------");

    }


}
