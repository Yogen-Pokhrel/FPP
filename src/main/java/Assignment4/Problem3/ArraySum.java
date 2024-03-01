package Assignment4.Problem3;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] myNumbers = {6,4,5,10};
        System.out.println("Sum of " + Arrays.toString(myNumbers) + " is " + sum(myNumbers, myNumbers.length));
    }

    private static int sum(int[] arr, int n){
        if(n == 0 ){
            return 0;
        }
        return arr[n - 1] + sum(arr,n - 1);
    }
}
