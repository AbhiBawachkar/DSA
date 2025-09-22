package LeetcodeProblems.Easy;

import java.util.HashMap;

public class SingleNumberBF {

    static int singleNumber(int[] arr){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int key : arr){
            mpp.put(key, mpp.getOrDefault(key,0 )+ 1);
        }
        for(int key : mpp.keySet()){
            if(mpp.get(key) == 1){
                return key;
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr1 = {2,2,1};
        int[] arr2 = {4,1,2,1,2,1};
        int[] arr3 = {1};
        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
        System.out.println(singleNumber(arr3));

    }
}
