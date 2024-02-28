package Assignment2;

/**
 * @author Yogen
 * @Professor: Burmaa Enkhbat
 * @Question:
 * <strong>Problem – 1</strong>
 * <br/>
 * Create a class called Prog1. In the main method of the class, output to the console the result
 * of doing the following two computations:
 * <br/><br/>
 * 1. get a random number x in the range 1 .. 9 and compute π to the power x.
 * <br/>
 * 2. get a random number y in the range 3 .. 14 and compute y to the power π.
 * <br/><br/>
 * Use the RandomNumbers.java class that has been provided for you as an attachment. (Do not
 * use the Random class directly.) Use Math API to solve π to the power x and y to the power π.
 */
public class Prog1{

    public static void main(String[] args) {
        //Question 1 - get π to the power x
        int x = RandomNumbers.getRandomInt(0, 9);

        double pi = Math.PI;
        double piPowX = Math.pow(pi, x);

        System.out.println("π value is " + pi);
        System.out.println("x value is " + x);
        System.out.println("π to the power x is " + piPowX);

        //Question 2 - get y to the power π
        int y = RandomNumbers.getRandomInt(3, 14);
        double yPowPi = Math.pow(y, pi);
        System.out.println("y value is " + y);
        System.out.println("y to the power π is " + yPowPi);

    }
}
