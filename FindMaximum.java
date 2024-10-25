import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Use the ternary operator to find the maximum number
        int max = (num1 > num2) ? num1 : num2;

        // Display the maximum number
        System.out.println("The maximum number is: " + max);

        // Close the scanner
        scanner.close();
    }
}
