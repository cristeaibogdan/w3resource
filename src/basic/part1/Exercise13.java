package basic.part1;

import java.util.Scanner;

/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.5 * 8.5 = 46.75
Perimeter is 2 * (5.5 + 8.5) = 28.00
 */
public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle Width = ");
        double a = input.nextDouble();

        System.out.println("Rectangle Height = ");
        double b = input.nextDouble();

        double perimeter = 2*(a+b);
        double area = a*b;

        System.out.println("Area is "+a+" * "+b+" = "+area);
        System.out.println("Perimeter is 2 * ("+a+" * "+b+") = "+perimeter);
    }
}
