package LeetcodeContest.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WC_467_Q2 {
    public static int[] ans(int arr[],int k){

        int temp1[] = new int[arr.length];


        Arrays.sort(arr);
        int temp[] = new int[k];
        for(int i = 0; i < temp.length; i++){
            temp[i] = arr[arr.length - i - 1];
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = {84,93,100,77,9};
        int[] result = ans(arr,3);
        System.out.println(Arrays.toString(result));

    }
}
