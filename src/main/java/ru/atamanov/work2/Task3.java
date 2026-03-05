package ru.atamanov.work2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main() {
        ArrayList<Employee> arrayList = new ArrayList<>(Arrays.asList(
                new Employee("Ivanov Ivan Ivanovich",20,"it",50000),
                new Employee("Petrov Petr Petrovich",21,"it",150000),
                new Employee("Atamanov Maksim Denisovich",20,"it",500000),
                new Employee("Smirnova Anna Sergeevna", 25, "hr", 75000),
                new Employee("Kuznetsov Dmitry Alexandrovich", 35, "management", 250000)
                ));
        List<String> result = arrayList.stream()
                .map(e -> {
                    String firstName = e.getFullName().split(" ")[1];
                    return firstName + " - " +  e.getDepartment();
                })
                .toList();
        System.out.println(result);
    }

}
class Employee{
    private String fullName;
    private int age;
    private String department;
    private double salary;

    public Employee(String fullName, int age, String department, double salary) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
