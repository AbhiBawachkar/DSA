package LeetcodeProblems.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateBF {
    public static int[] removeDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
//        for(int nums : arr) {
//            set.add(nums);
//        }
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        int j = 0;
        for(int nums : set){
            arr[j] = nums;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,7,1,0,0,1,1,1,2,2,3,3,4};
        int[] arr2 = {8,8,7,7,7,6,6,6,4,4,4,4,5,5,5,1,1,1,1,3,3,3,0,0,0,1,1,1};
        int[] arr3 = {-3,-1,0,0,0,3,3};
        System.out.println(Arrays.toString(removeDuplicate(arr3)));

    }
}
