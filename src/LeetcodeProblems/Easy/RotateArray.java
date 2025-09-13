package LeetcodeProblems.Easy;
import java.util.Arrays;

public class RotateArray {
     static int[] rotate(int[] nums, int k){
         int[] temp = new int [nums.length];
         for(int i = 0; i < nums.length; i++){
             temp[(i + k) % nums.length] = nums[i];
         }
         for(int i = 0; i < nums.length; i++) {
             temp[i] = nums[i];
         }
         return temp;
    }
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7};
         int k = 3;
        System.out.println(Arrays.toString(rotate(arr,3)));

    }
}
