package basic.part1;
/*
Write a Java program to compute the area of a polygon. Go to the editor
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
 */

import java.util.Scanner;

public class Exercise035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number of sides on the polygon:");
        int n = input.nextInt();

        System.out.println("Input the length of one of the sides:");
        int s = input.nextInt();

        double area = (n*Math.pow(s,2))/(4*Math.tan(Math.PI/n));
        System.out.println("The area is: "+area);
    }
}
