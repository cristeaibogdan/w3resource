package w3resource.basicpart1;
/*
Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
Sample Output:

Input the first number : 35
Input the second number: 45
Result: true
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise064 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;

        System.out.println("Inputs must be numbers and be between 25 and 75!");

        try {
            System.out.println("Input first number: ");
            a = input.nextInt();

            System.out.println("Input second number: ");
            b = input.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Numbers only!");
            System.exit(0);
        }

        if (a > 25 && a < 75 || b > 25 && b < 75) {
            System.out.println("We are in the described domain!");
            System.out.println(common(a, b));
        }

        if (a < 25 || a > 75 && b < 25 || b > 75)
            System.out.println("Input MUST be between 25 and 75!");
    }

    public static boolean common(int a, int b) {

        if (a / 10 == b / 10 || a % 10 == b % 10) {
            return true;
        } else return false;
    }
}
