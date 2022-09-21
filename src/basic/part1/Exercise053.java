package basic.part1;

import java.util.Scanner;

/*
Write a Java program that accepts three integers from the user and return true if the second number
is greater than first number and third number is greater than second number.

Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
 */
public class Exercise053 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int a = input.nextInt();

        System.out.println("Input the second number: ");
        int b = input.nextInt();

        System.out.println("Input the third number: ");
        int c = input.nextInt();

        if (b > a && c > b) {
            System.out.println("The result is: True");
        }
    }
}
