package Assignment2;

import java.util.Arrays;
/**
 * @author Yogen
 * @Professor: Burmaa Enkhbat
 * @Question:
 * <strong>Problem – 5</strong>
 * <br/>
 * Create a class Prog5 and implement the given method which takes the two arrays of inputs
 * and combine the two arrays into single array.<br/><br/>
 * public int[] combine(int[] a, int[] b);<br/><br/>
 * Example: Input array a : [5,6,-4,3,1]<br/>
 * Input array b: [ 3,8,9,11]<br/>
 * Output arrays: [ 5,6,-4,3,1, 3,8,9,11]
 */
public class Prog5 {
    public static void main(String[] args) {
        int[] a = {5,6,-4,3,1};
        int[] b = { 3,8,9,11};
        int[] combined = combine(a, b);
        int[] combined2 = combineOption2(a,b);
        //for a = {5,6,-4,3,1} & b = { 3,8,9,11} output will be {5, 6, -4, 3, 1, 3, 8, 9, 11}
        System.out.println(Arrays.toString(combined));
        System.out.println(Arrays.toString(combined2));
    }

    static public int[] combine(int[] a, int[] b){
        int[] combinedArray = new int[a.length + b.length];
        System.arraycopy(a, 0, combinedArray, 0, a.length);
        System.arraycopy(b, 0, combinedArray, a.length, b.length);
        return combinedArray;
    }

    /**
     * This functions solves the problem using for loops
     * @param a int[]
     * @param b int[
     * @return int[
     */
    static public  int[] combineOption2(int[] a, int[] b){
        int totalLength = a.length + b.length;
        int[] combinedArray = new int[totalLength];
        int i = 0;
        for(; i < a.length; i++){
            combinedArray[i] = a[i];
        }

        for(int j = 0; j < b.length; j++ ){
            combinedArray[i++] = b[j];
        }
        return combinedArray;
    }
}
