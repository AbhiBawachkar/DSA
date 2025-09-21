package LeetcodeProblems.Easy;

import java.util.Arrays;

public class RemoveDuplicateOp {
    static int move(int[] arr){
        int i = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        for(int val : arr){
            System.out.print(val+ " ");
        }
        System.out.println();
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {7,7,1,0,0,1,1,1,2,2,3,3,4};
        int[] arr2 = {8,8,7,7,7,6,6,6,4,4,4,4,5,5,5,1,1,1,1,3,3,3,0,0,0,1,1,1};
        int[] arr3 = {-3,-1,0,0,0,3,3};
        System.out.println(move(arr3));
    }
}
