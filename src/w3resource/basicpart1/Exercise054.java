package w3resource.basicpart1;
/*
Write a Java program that accepts three integers from the user and
return true if two or more of them (integers) have the same rightmost digit.
The integers are non-negative.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
 */
import java.util.Scanner;

public class Exercise054 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int a = input.nextInt();

        System.out.println("Input the second number: ");
        int b = input.nextInt();

        System.out.println("Input the third number: ");
        int c = input.nextInt();

        System.out.println("The result is: "+DigitTest(a,b,c));
    }

        public static boolean DigitTest(int first, int second, int third) {
        return (first%10 == second%10 || second%10 == third%10 || first%10 == third%10);
        }
    }
