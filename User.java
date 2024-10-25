package EmployeeSalary;

//Base class: User
class User {
 protected int id;
 protected String name;

 // Parameterized constructor
 public User(int id, String name) {
     this.id = id;
     this.name = name;
 }

 // Getter methods
 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }
}