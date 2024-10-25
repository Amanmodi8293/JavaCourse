import java.util.Scanner;

class Bank {
    private double amount;

    // Parameterized constructor
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    // Method to withdraw money
    public void withdraw(double withdrawalAmount) {
        // Check if there are sufficient funds
        String message = (amount >= withdrawalAmount) ? "Withdraw successful" : "Insufficient funds";
        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount; // Update amount
        }
        System.out.println(message);
    }

    // Method to deposit money
    public void deposit(double depositAmount) {
        amount += depositAmount; // Update amount
        System.out.println("Deposit successful");
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Bank bank = new Bank(10000); // Initialize with amount 10000

        bank.withdraw(6000); // Try to withdraw 6000
        bank.deposit(5000); // Deposit 5000
        bank.displayBalance(); // Display total balance
    }
}

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Find maximum using ternary operator
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum number is: " + max);
    }
}

public class BitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the bit position (n): ");
        int n = scanner.nextInt();

        // Check if the nth bit is set
        boolean isSet = (num & (1 << n)) != 0;

        System.out.println("The " + n + "th bit is " + (isSet ? "set (1)" : "not set (0)"));
    }
}
