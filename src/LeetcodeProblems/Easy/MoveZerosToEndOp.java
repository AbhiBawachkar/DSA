package LeetcodeProblems.Easy;

import java.util.Arrays;

public class MoveZerosToEndOp {
    public static int[] move(int[] arr){
        int nonZero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
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
