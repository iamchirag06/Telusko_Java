package CoreJava;

// Base class Employee
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize fields (as required)
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Public getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // getDetails() method that returns the specified format
    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

// Subclass Manager that extends Employee
class Manager extends Employee {
    private String department;

    // Constructor that uses super() to call parent constructor
    public Manager(String name, double salary, String department) {
        super(name, salary); // Call parent constructor
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Override getDetails() to include department
    @Override
    public String getDetails() {
        return "Name: " + getName() + ", Salary: " + getSalary() + ", Department: " + department;
    }
}

public class Question {
    public static void main(String[] args) {
        // Create Employee and Manager objects
        Employee employee = new Employee("Alice", 50000.0);
        Employee manager = new Manager("Bob", 75000.0, "IT");

        // Print their details using getDetails() method
        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());
    }
}