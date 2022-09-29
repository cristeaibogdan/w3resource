package w3resource.basicpart1;
/*
Write a Java program to extract the first half of a string of even length.
Test Data: Python
Sample Output:
Pyt
 */

public class Exercise069 {
    public static void main(String[] args) {

        String string = "Python";

        if (string.length()%2==0) {
            System.out.println(string.substring(0, string.length()/2));
        }
    }
}
