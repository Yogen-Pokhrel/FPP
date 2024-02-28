package Assignment2;

import java.util.Arrays;
/**
 * @author Yogen
 * @Professor: Burmaa Enkhbat
 * @Question:
 * <strong>Problem – 3</strong>
 * <br/>
 * Write a program called RemoveDups. Create an array which accepts an array of Strings only.
 * Creates a new array in which all duplicate Strings in the original input array have been
 * removed. You should not use any APIs like HashSet, TreeSet etc., Write your own logic.
 * Also, your result should not contain null values.
 * For example, if the input array is
 *  <br/> <br/>
 * ["horse", "dog", "cat", "horse", dog"]
 *  <br/> <br/>
 * then the output would be the following array: <br/>
 * ["horse","dog","cat"]
 */
public class Prog3 {
    public static void main(String[] args) {
        //feel free to change the inputs
        String[] strList = {"horse", "dog", "cat", "horse", "dog"};
        String[] uniqueItems = removeDups(strList);
        System.out.println(Arrays.toString(uniqueItems));

    }

    static String[] removeDups(String[] inputString){
        String[] uniqueArray = new String[0];
        for(int i = 0; i < inputString.length; i++){
            if(!hasItem(uniqueArray, inputString[i])){
                //increase the array size
                String[] newSet = new String[uniqueArray.length + 1];
                //copy old array to new array
                System.arraycopy(uniqueArray, 0, newSet, 0, uniqueArray.length);
                //add the new value
                newSet[uniqueArray.length] = inputString[i];
                //update the main array
                uniqueArray = newSet;
            }
        }
        return uniqueArray;
    }

    static Boolean hasItem(String[] arr, String item){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null && arr[i].equals(item)){
                return true;
            }
        }
        return false;
    }
}
