package w3resource.basicpart1;
/*
Write a Java program to compute a specified formula. Go to the editor
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765
 */

public class Exercise010 {
    public static void main(String[] args) {

        double expression;
        expression = 4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        System.out.println(expression);
    }
}
