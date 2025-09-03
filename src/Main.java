import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user for two integers
        System.out.print("Enter the first integer (num1): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer (num2): ");
        int num2 = scanner.nextInt();

        // arithmetic operations
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        if(num2 != 0) {
            System.out.println("Remainder (num1 % num2): " + (num1 % num2));
        } else {
            System.out.println("Remainder: Cannot divide by zero");
        }

        // If conditions - comparing numbers and equality
        if (num1 > num2) {
            System.out.println("Greater number: num1 (" + num1 + ")");
        } else if (num2 > num1) {
            System.out.println("Greater number: num2 (" + num2 + ")");
        } else {
            System.out.println("Both numbers are equal.");
        }

        // logical operators - positivity checks
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both are positive.");
        } else if ((num1 > 0 && num2 <= 0) || (num1 <= 0 && num2 > 0)) {
            System.out.println("One is positive.");
        } else {
            System.out.println("No positives.");
        }

        // ternary operators
        String greaterNum = (num1 > num2) ? "num1 (" + num1 + ") is greater" :
                (num2 > num1) ? "num2 (" + num2 + ") is greater" : "Both are equal";
        System.out.println("Using ternary operator - " + greaterNum);

        String num1EvenOdd = (num1 % 2 == 0) ? "num1 (" + num1 + ") is even" : "num1 (" + num1 + ") is odd";
        System.out.println("Using ternary operator - " + num1EvenOdd);

        scanner.close();
    }
}
