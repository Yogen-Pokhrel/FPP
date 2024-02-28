package Assignment2;
/**
 * @author Yogen
 * @Professor: Burmaa Enkhbat
 * @Question:
 * <strong>Problem – 4</strong>
 * <br/>
 * Create a class Prog4. Inside its main method, create float variables to store each of the following
 * numbers:<br/>
 * 1.27, 3.881, 9.6<br/><br/>
 * Output to the console the following two values:
 * 1. the sum of the floats as an integer, obtained by casting the sum to type int
 * 2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, using the
 * Math.round function
 */
public class Prog4 {
    public static void main(String[] args) {
        float a = 1.27f;
        float b = 3.881f;
        float c = 9.6f;

        int integerPartAfterSum = (int)(a + b + c);
        System.out.println("Integer Sum of " + a + " + " + b + " + " + c + " = " + integerPartAfterSum);

        int sumAfterRoundingUp = Math.round(a+b+c);
        System.out.println("Sum after rounding all number is " + sumAfterRoundingUp);

    }
}
