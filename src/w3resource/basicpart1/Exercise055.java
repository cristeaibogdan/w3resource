package w3resource.basicpart1;
/*
Write a Java program to convert seconds to hour, minute and seconds.
Sample Output:

Input seconds: 86399
23:59:59
 */

import java.util.Scanner;

public class Exercise055 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input seconds: ");
        long seconds = input.nextLong();

        long secondsleft = seconds%60;

        long minutes = seconds/60;
        //System.out.println(minutes);

        long minutesleft = minutes%60;

        long hours = minutes/60;
        //System.out.println(hours);

        System.out.println(hours+":"+minutesleft+":"+secondsleft);
    }
}

