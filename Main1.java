package EmployeeSalary;

public class Main {
    public static void main(String[] args) {
        // Create an object of Employee class
        Employee employee = new Employee(210774, "Dipanshu sahu", 50000.0);

        // Calculate and display the annual salary
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + annualSalary);
    }
}