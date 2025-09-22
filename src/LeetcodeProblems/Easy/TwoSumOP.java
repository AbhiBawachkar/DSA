package LeetcodeProblems.Easy;

import java.util.Arrays;

public class TwoSumOP {

    static boolean twoSum(int[] arr, int target){
        Arrays.sort((arr));
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] + arr[j] == target){
                return true;
            }
            else if( arr[i] + arr[j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 12;
        System.out.println(twoSum(arr,target));
    }
}
