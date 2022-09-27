package w3resource.basicpart1;
/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class Exercise012 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");
        int a = input.nextInt();

        System.out.println("Input second number");
        int b = input.nextInt();

        System.out.println("Input third number");
        int c = input.nextInt();

        int Average = (a+b+c)/3;
        System.out.println("The average is: "+Average);
    }
}
