package basic.part1;

/*Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.Scanner;

public class Exercise007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tabla inmultirii pentru: ");
        int a = input.nextInt();

        for (int b=0;b<=10;b++) {
            System.out.println(a+" x "+b+" = "+(a*b));
        }
    }
}
