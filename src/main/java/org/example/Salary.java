package org.example;

public class Salary {
    private String from;
    private String to;
    private int salary;

    public Salary(String from, String to, int salary) {

        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
