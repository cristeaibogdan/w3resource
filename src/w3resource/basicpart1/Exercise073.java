package w3resource.basicpart1;
/*
Write a Java program to create a new string taking first three characters from a given string.
If the length of the given string is less than 3 use "#" as substitute characters.
Test Data: Str1 = " "
Sample Output:
###
 */

public class Exercise073 {
    public static void main(String[] args) {

        String Str1 = "Data";

        if (Str1.length()==1) {
            System.out.println(Str1.substring(0)+"##");
        }

        if (Str1.length()==2) {
            System.out.println(Str1.substring(0)+"#");
        }

        if (Str1.length()>=3) {
            System.out.println("###");
        }
    }
}

