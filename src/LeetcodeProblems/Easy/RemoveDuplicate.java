package LeetcodeProblems.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static int[] removeDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int nums : arr) {
            set.add(nums);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicate(arr);
        //System.out.println(Arrays.toString(removeDuplicate(arr)));

    }
}
