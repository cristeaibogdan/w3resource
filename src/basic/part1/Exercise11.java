package basic.part1;

import java.util.Scanner;

/*
Write a Java program to print the area and perimeter of a circle. Go to the editor
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Raza cercului este: ");
        double r = input.nextDouble();

        double Perimeter = 2*Math.PI*r;
        double Area = Math.PI*Math.pow(r,2);

        System.out.println("Perimeter is: "+Perimeter);
        System.out.println("Area is: "+Area);
    }
}
