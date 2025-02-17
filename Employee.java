package com.employee;

public class Employee {

    private double salary;

    private String name;

    private String job_role;

    public Employee(double salary, String job_role) {
        this.salary = salary;
        this.job_role = job_role;
    }

    public Employee(double salary, String name, String job_role) {
        this.salary = salary;
        this.name = name;
        this.job_role = job_role;
    }

    public double getSalary() {
        return salary;
    }




    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob_role() {
        return job_role;
    }

    public void setJob_role(String job_role) {
        this.job_role = job_role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
