package basic.part1;

import java.util.Scanner;

/*
Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
 */
public class Exercise052 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int a = input.nextInt();

        System.out.println("Input the second number: ");
        int b = input.nextInt();

        System.out.println("Input the second number: ");
        int c = input.nextInt();

        if (a+b==c) {
            System.out.println("true");
        }
    }
}
