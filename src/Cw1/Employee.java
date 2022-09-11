package Cw1;

public class Employee {
    private String name;
    private String middleName;
    private String surName;

    private int department;

    private double salary;

    private int id;
    private static int counter;


    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurName() {
        return surName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setDepartment(int department) {
        if (department < 0 || department > 5)
            throw new IllegalArgumentException(" Введено неправильное значение department");
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Employee (String name, String middleName, String surName, int department, double salary) {
        if (department < 0 || department > 5) throw new IllegalArgumentException(" Введено неправильное значение department");
        this.id = ++ counter;
        this.name = name;
        this.middleName = middleName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + "." +  name +  " " + middleName + " " + surName + ", " +
                department + ", " + salary;
    }
}
