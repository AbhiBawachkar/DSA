package LeetcodeProblems.Medium;

import java.util.Arrays;

public class SortColorsOP {
    static int[] sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }

            else if(arr[mid] == 1){
                mid++;
            }

            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int[] arr1 = {0,0,0,2,2,2,1,1,1};
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort(arr1)));
    }
}
