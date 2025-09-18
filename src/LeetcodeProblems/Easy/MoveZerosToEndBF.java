package LeetcodeProblems.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEndBF {

    public static int[] move(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] !=0 ){
                temp.add(arr[i]);
            }
        }
        int NonZero = temp.size();
        for(int i = 0; i < NonZero; i++){
            arr[i] = temp.get(i);
        }

        for(int i = NonZero; i < arr.length; i++){
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,0,12};
        System.out.println(Arrays.toString(move(arr)));
    }
}
