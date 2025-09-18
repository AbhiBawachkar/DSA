package LeetcodeProblems.Easy;

import java.util.Arrays;

public class ConcatArraySOp {
    public static int[] concat(int[] arr1){
        int[] temp = new int[arr1.length * 2];
        for(int i = 0; i < arr1.length; i++){
            temp[i] = arr1[i];
            temp[arr1.length + i] = arr1[i];
        }
        Arrays.sort(temp);
        return temp;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,1};
        System.out.println(Arrays.toString(concat(arr1)));
    }
}
