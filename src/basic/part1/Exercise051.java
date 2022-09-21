package basic.part1;

import java.util.Scanner;

/*
Write a Java program to convert a string to an integer in Java.
Sample Output:

Input a number(string): 25
The integer value is: 25
 */
public class Exercise051 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Input a number (string): ");

        String A = input.next();
        int result = Integer.parseInt(A);
        System.out.println("The integer value is: "+result);
    }
}
