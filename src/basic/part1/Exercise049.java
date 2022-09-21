package basic.part1;
/*
Write a Java program to accept a number and check the number is even or not.
Prints 1 if the number is even or 0 if the number is odd.
Sample Output:

Input a number: 20
1
 */

import java.util.Scanner;

public class Exercise049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number: ");
        int a = input.nextInt();

        if (a%2==0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

