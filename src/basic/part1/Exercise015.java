package basic.part1;
/*
Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Exercise015 {
    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number: ");
        a = input.nextInt();

        System.out.println("Input second number: ");
        b = input.nextInt();

        System.out.println("Before the swap a = "+a+ " and b = "+b);

        c=a;
        a=b;
        b=c;

        System.out.println("After the swap a = "+a+ " and b = "+b);


    }
}
