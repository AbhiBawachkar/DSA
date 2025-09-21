package LeetcodeProblems.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnionOFTwoSortedArrayBF {
    static int[] union(int[] arr1, int[]arr2){
        Set<Integer> set = new TreeSet<>();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        int[] temp = new int[set.size()];
        int j = 0;
        for(int val : set){
            temp[j] = val;
            j++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1= {1,2,3,3,4,5,7};
        int[] arr2= {1,2,3,9,9,10,11,11,12,17,17};
        System.out.println(Arrays.toString(union(arr1, arr2)));

    }
}
