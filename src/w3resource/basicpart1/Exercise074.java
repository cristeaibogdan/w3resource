package w3resource.basicpart1;
/*
Write a Java program to test if 10 appears as either the first or last element of an array of integers.
The length of the array must be greater than or equal to 2.
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10
true
 */

public class Exercise074 {
    public static void main(String[] args) {

        try {
            int [] ArrayOne = {10, -20, 0, 30, 40, 60, 10};
            int [] ArrayTwo = {5, -20, 0, 30, 40, 60, 10};
            int [] ArrayThree = {10, -20, 0, 30, 40, 60, 5};
            int [] ArrayFour = {-10, -20, 0, 30, 40, 60, 32};
            int [] ArrayFive = {2, 10};
            int [] ArraySix = {10};
            int [] ArraySeven = {};

            System.out.println("ArrayOne has 10 at first or last position => " + FirstLast(ArrayOne, 10));
            System.out.println("ArrayTwo has 10 at first or last position => " + FirstLast(ArrayTwo, 10));
            System.out.println("ArrayThree has 10 at first or last position => " + FirstLast(ArrayThree, 10));
            System.out.println("ArrayFour has 10 at first or last position => " + FirstLast(ArrayFour, 10));
            System.out.println("ArrayFive has 10 at first or last position => " + FirstLast(ArrayFive, 10));
            System.out.println("ArraySix has 10 at first or last position => " + FirstLast(ArraySix, 10));
            System.out.println("ArraySeven has 10 at first or last position => " + FirstLast(ArraySeven, 10));
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array must have at least one element!");
        }
    }

    static boolean FirstLast(int[] array, int a) throws ArrayIndexOutOfBoundsException {

        return array[0] == a || array[array.length - 1] == a;
    }
}
