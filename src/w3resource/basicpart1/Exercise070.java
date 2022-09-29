package w3resource.basicpart1;
/*
Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
The strings must not have the same length.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

PythonTutorialPython
 */

public class Exercise070 {
    public static void main(String[] args) {
        String stringOne = "Short";
        String stringTwo = "LongLongLong";

        if (stringOne.length()>stringTwo.length()) {
            System.out.println(stringTwo+stringOne+stringTwo);
        }

        if (stringTwo.length()>stringOne.length()) {
            System.out.println(stringOne+stringTwo+stringOne);
        }
    }
}
