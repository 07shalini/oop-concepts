
# Employee Salary Calculator

This Java program calculates the annual salary of employees based on their type. It supports two types of employees: Manager and Engineer. Each type of employee has a different way of calculating their annual salary.

## Features
* Calculates annual salary for Manager and Engineer employees
* Takes into account bonus for Manager employees
* Takes into account overtime for Engineer employees
* Formats output to display annual salary with exactly two decimal places

## Inheritance
This program demonstrates the concept of inheritance in object-oriented programming. The `Manager` and `Engineer` classes inherit the properties and methods of the `Employee` class, and also add their own specific attributes and methods. This allows for code reuse and facilitates the creation of a hierarchy of related classes.

* The `Employee` class serves as the base class, providing common attributes and methods for all employees.
* The `Manager` and `Engineer` classes extend the `Employee` class, adding their own specific attributes and overriding the `getAnnualSalary` method to calculate their annual salary based on their type.

## Usage
1. Run the program and enter the type of employee (Manager or Engineer)
2. Enter the employee details in the format specified (name,salary,bonus or name,salary,overtime)
3. The program will calculate and display the annual salary of the employee

## Input Format
* Type of employee (Manager or Engineer)
* Comma-separated list of employee attributes (name,salary,bonus or name,salary,overtime)

## Output Format
* Annual Salary of <EmployeeType>: <AnnualSalary> (with exactly two decimal places)

## Constraints
* Salary and bonus values are positive integers
* Overtime value is a positive integer
* Name is a string with a maximum length of 50 characters
* Salary, bonus, and overtime values must be between 1 and 1,000,000 inclusive
* Input values must be provided in the correct format
* No leading or trailing spaces in comma-separated input values

## Example Use Cases
* Manager: Alice,60000,10000
* Engineer: Bob,50000,5000

## Code Structure
* Employee.java: Base class with private attributes name and salary
* Manager.java: Subclass of Employee with private attribute bonus
* Engineer.java: Subclass of Employee with private attribute overtime
* Main.java: Main class with program entry point

## Inheritance Hierarchy
* Employee (Base Class)
	+ Manager (Subclass)
	+ Engineer (Subclass)

This inheritance hierarchy allows for a clear and organized structure, making it easy to add new types of employees in the future.
```