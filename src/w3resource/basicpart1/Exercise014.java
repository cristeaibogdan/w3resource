package w3resource.basicpart1;

/*
Write a Java program to print an American flag on the screen. Go to the editor
Expected Output

* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
==============================================
==============================================
==============================================
==============================================
==============================================
==============================================
 */
public class Exercise014 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * *  ==================================");
        }

        System.out.println("* * * * * * ==================================");
        for (int i = 1; i <= 6; i++) {
            System.out.println("==============================================");
        }

    }
}