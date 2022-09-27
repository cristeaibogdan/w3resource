package w3resource.basicpart1;
/*
Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
Sample Output:

1
3
5
7
9
11
....

91
93
95
97
99
 */

public class Exercise048 {
    public static void main(String[] args) {

        int a;
        for (a=0;a<100;a++) {
            if (a % 2 == 1) {
                System.out.println(a);
            }
        }
    }
}
