package LeetcodeProblems.Easy;

import java.util.Arrays;

public class ReverseArray2 {
    static void reverse (int[] arr, int k){
        int start = k + 1;
        int end = arr.length - 1;
        while(start <= end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start ++;
            end --;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reverse(array,3);
        System.out.println(Arrays.toString(array));
    }
}
