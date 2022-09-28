package various.Exercises;
import java.util.Scanner;

public class Century {
    /*
    what century is this year in?

    1900 => 17
    1901 => 19
    2000 => 20
    2030 => 21
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the year: ");
        int year = input.nextInt();

        int century = year / 100;
        int remains = year % 100;

        //System.out.println("Rounded down is: "+century);
        //System.out.println("Remains is: "+numberrest);

        if (remains != 0) {
            System.out.println("We are in century: " + (century + 1));
        }

        if (remains == 0) {
            System.out.println("We are in century: " + (century));
        }

    }
}
