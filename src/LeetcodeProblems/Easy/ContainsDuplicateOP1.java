package LeetcodeProblems.Easy;

import java.util.Arrays;

public class ContainsDuplicateOP1 {

    static boolean isDuplicate(int[] arr){
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(isDuplicate(arr));

    }
}
