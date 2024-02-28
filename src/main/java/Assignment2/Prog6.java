package Assignment2;

import java.util.Arrays;
/**
 * @author Yogen
 * @Professor: Burmaa Enkhbat
 * @Question:
 * <strong>Problem – 6</strong>
 * <br/>
 * Create a Java method
 * static int min(int[] arrayOfInts)
 * (in a class Prog6) that outputs the minimum of an array of ints.<br/><br/>
 * Example: For the given array of int inputs, method return the result of minimum -22<br/><br/>
 * [2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22]<br/><br/>
 *
 * <strong>NOTE: You may not use the sorting tools available in the Java libraries; for instance, you may not call
 * Arrays.sort() to sort the input array. (No credit if you do it this way.)</strong>
 */
public class Prog6 {
    public static void main(String[] args) {
        int[] inputs = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minNumber = min(inputs);
        System.out.println("Min number of " + Arrays.toString(inputs) + " is " + minNumber);
    }

    static int min(int[] arrayOfInts){
        int min = Integer.MAX_VALUE;
        for(int x : arrayOfInts){
            if(x < min){
              min = x;
            }
        }
        return min;
    }
}
