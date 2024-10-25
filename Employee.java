package EmployeeSalary;

//Subclass: Employee
class Employee extends User {
 private double salary;

 // Parameterized constructor
 public Employee(int id, String name, double salary) {
     super(id, name); // Call the User class constructor
     this.salary = salary;
 }

 // Method to calculate annual salary
 public double calculateAnnualSalary() {
     return salary * 12;
 }

 // Getter method
 public double getSalary() {
     return salary;
 }
}