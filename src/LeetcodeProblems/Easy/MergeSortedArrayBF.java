package LeetcodeProblems.Easy;

import java.util.Arrays;

public class MergeSortedArrayBF {

    public static int[] MergeSorted(int nums[], int n, int nums2[], int m){
        for(int i = 0; i < nums2.length; i++){
            nums[n+i] = nums2[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        System.out.println(Arrays.toString(MergeSorted(nums,3, nums2,3)));
    }
}
