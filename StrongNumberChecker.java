package COM.MODI;

import java.util.Scanner;

public class StrongNumberChecker {

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a Strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        // Extract digits and calculate sum of factorials
        while (number > 0) {
            int digit = number % 10; // Get last digit
            sumOfFactorials += factorial(digit); // Add factorial of digit to the sum
            number /= 10; // Remove last digit
        }
       // Check if the sum of factorials is equal to the original number
        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

        scanner.close();
    }
}
