package w3resource.basicpart1;
/*
Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39
25 < 39
25 <= 39
 */

import java.util.Scanner;

public class Exercise032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First input is ");
        int a = input.nextInt();

        System.out.println("Second input is ");
        int b = input.nextInt();

        if (a!=b) {System.out.println(a+" != "+b);}
        if (a<b) {System.out.println(a+" < "+b);}
        if (a<=b) {System.out.println(a+" <= "+b);}

        if (a>b) {System.out.println(a+" > "+b);}
        if (a>=b) {System.out.println(a+" >= "+b);}
    }
}
