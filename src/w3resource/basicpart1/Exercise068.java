package w3resource.basicpart1;

/*
Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
The length of the original string must be 3 and above.
Sample Output:

3.03.03.03.0
 */

public class Exercise068 {
    public static void main(String[] args) {
        String string = "Python 3.0";

        String last = string.substring(string.length()-3);
        System.out.println("This are the last 3 chars => " +last);

        String result = last+last+last+last;

        System.out.println("This is the result => "+result);
    }
}
