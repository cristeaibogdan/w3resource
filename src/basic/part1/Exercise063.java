package basic.part1;

import java.util.Scanner;

/*
Write a Java program that accepts two integer values from the user and return the larger values.
However if the two values are the same, return 0 and return the smaller value if the two values
have the same remainder when divided by 6.
Sample Output:

Input the first number : 12
Input the second number: 13
Result: 13
 */
public class Exercise063 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int a = input.nextInt();

        System.out.println("Input the second number: ");
        int b = input.nextInt();

        System.out.println("Result: " +result(a,b));
    }

    public static int result(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 6 == b % 6) {
            return (a < b) ? a : b;
        }
        return (a > b) ? a : b;
    }
}

