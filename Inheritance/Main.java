package MyProject;

import java.util.Scanner;

// Base class Employee
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Method to calculate annual salary
    public double getAnnualSalary() {
        return salary * 12; // calculate annual salary by multiplying monthly salary by 12
    }
}

// Subclass Manager extending Employee
class Manager extends Employee {
    private double bonus;

    // Constructor to initialize manager details
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    // Setter method for bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override method to calculate annual salary including bonus
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + bonus; // bonus is already annual
    }
}

// Subclass Engineer extending Employee
class Engineer extends Employee {
    private double overtime;

    // Constructor to initialize engineer details
    public Engineer(String name, double salary, double overtime) {
        super(name, salary);
        this.overtime = overtime;
    }

    // Setter method for overtime
    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    // Override method to calculate annual salary including overtime
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + overtime; // overtime is already annual
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Read input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type:");
        String type = sc.nextLine();
        System.out.println("Enter the values:");
        String values = sc.nextLine();
        String[] v = values.split(",");

        // Create appropriate Employee object based on input
        // Print the annual salary
        String name = v[0];
        double salary = Double.parseDouble(v[1]);
        double addent = Double.parseDouble(v[2]);

        if (type.equals("Manager")) {
            Manager m = new Manager(name, salary, addent);
            double r = m.getAnnualSalary();
            System.out.printf("Annual Salary of Manager: %.2f%n", r);
        } else {
            Engineer e = new Engineer(name, salary, addent);
            double r = e.getAnnualSalary();
            System.out.printf("Annual Salary of Engineer: %.2f%n", r);
        }
    }
}


