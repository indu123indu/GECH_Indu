package Assignment_In_Java;

// Abstract class Employee
abstract class Employee {
    protected String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name); // Pass name to Employee constructor
        this.monthlySalary = monthlySalary;
    }

    // Implement calculateSalary method
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name); // Pass name to Employee constructor
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement calculateSalary method
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to test the implementation
public class EmployeeTest {
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee("Alice", 5000);
        Employee partTimeEmp = new PartTimeEmployee("Bob", 20, 80);

        fullTimeEmp.displayDetails();
        System.out.println();
        partTimeEmp.displayDetails();
        


}
}