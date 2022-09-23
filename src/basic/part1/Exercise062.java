package basic.part1;
/*
Write a Java program that accepts three integer values and return true if one of them is 20
or more and less than the substractions of others.
Sample Output:

Input the first number : 15
Input the second number: 20
Input the third number : 25
false
 */

import java.util.Scanner;

public class Exercise062 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int a = input.nextInt();

        System.out.println("Input the second number: ");
        int b = input.nextInt();

        System.out.println("Input the third number: ");
        int c = input.nextInt();

        System.out.println(((a-b)>=20 || (b-c)>=20 || (a-c)>=20));
    }
}
