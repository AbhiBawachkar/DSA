package LeetcodeProblems.Easy;

import java.util.Arrays;

public class MoveZerosToEndOp {
    public static int[] move(int[] arr){
        int left = 0;
        for(int right = 0; right < arr.length; right++){
            if(arr[right] != 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,1,5,0,1,1,5,1,6,7};
        int[] arr2 = {0};
        System.out.println(Arrays.toString(move(arr)));
    }
}
