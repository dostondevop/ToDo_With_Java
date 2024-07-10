package uz.pdp.example_2;

public class Employee {
    private String fullName;
    private double salary;

    public Employee() {
        System.out.println("Employee no arg constructor called");
    }

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
        System.out.println("Employee two arg constructor called");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
