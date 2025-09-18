package LeetcodeProblems.Easy;

import java.util.Arrays;

public class ConcatArrayBF {
    public static int[] concat(int[] arr1, int[]arr2){
        int[] temp = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            temp[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            temp[arr1.length + i] = arr2[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,1};
        int[] arr2 = {1,2,1};
        System.out.println(Arrays.toString(concat(arr1,arr2)));
    }
}
