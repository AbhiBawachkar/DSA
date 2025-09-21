package LeetcodeProblems.Easy;

import java.security.Key;
import java.util.HashMap;

public class MajorityElement {

    static int majority(int[] arr){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int len = arr.length/2;
        for(int num : arr){
            mpp.put(num,mpp.getOrDefault(num ,0) + 1);
        }
        for(int key : mpp.keySet()){
            if(mpp.get(key) > len){
                return key;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int[] arr2 = {2,2,1,1,1,2,2};
        System.out.println(majority(arr));
        System.out.println(majority(arr2));
    }
}
