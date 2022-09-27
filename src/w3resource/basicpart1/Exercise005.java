package w3resource.basicpart1;
/*
Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */

import java.util.Scanner;

public class Exercise005 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First number is: ");
        int a = input.nextInt();

        System.out.println("Second number is: ");
        int b = input.nextInt();

        System.out.println(a+" x "+b+ " = "+(a*b));
    }
}
