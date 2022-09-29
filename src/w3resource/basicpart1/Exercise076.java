package w3resource.basicpart1;
/*
Write a Java program to test if the first or the last element of two array of integers are same.
The length of the array must be greater than or equal to 2.
Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
array2 = 45, 20, 10, 20, 30, 50, 11
Sample Output:
false
 */

public class Exercise076 {
    public static void main(String[] args) {

        try {
            int ArrayOne[] = {50, -20, 0, 30, 40, 60, 12};
            int ArrayTwo[] = {50, 20, 10, 20, 30, 50, 11};
            int ArrayThree[] = {10};
            int ArrayFour[] = {};

            System.out.println("First or last element of array one and two are the same => " + FirstLast(ArrayOne, ArrayTwo));
            System.out.println("First or last element of array three and four are the same => " + FirstLast(ArrayThree, ArrayFour));
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array must have at least ONE element!");
        }
    }

    static boolean FirstLast(int[] arrayOne, int[] arrayTwo) throws ArrayIndexOutOfBoundsException {

        if (arrayOne[0] == arrayTwo[0] || arrayOne[arrayOne.length - 1]==arrayTwo[arrayTwo.length - 1]) {
            return true;
        } else {
            return false;
        }
    }
}
