package LeetcodeProblems.Easy;

import java.util.HashSet;

/*
The hash set approach uses a hash set data structure to store encountered elements.
It iterates through the array, checking if an element is already in the set.
If so, it returns true. Otherwise, it adds the element to the set.
This approach has a time complexity of O(n) and provides an efficient way to check for duplicates.

Explanation:
A more efficient approach is to use a hash set data structure to store the encountered elements.
While iterating through the array, if an element is already present in the hash set, return true.
Otherwise, add the element to the hash set.
If the loop completes without finding any duplicates, return false.
 */

public class ContainsDuplicateOP2 {

    static boolean isDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(isDuplicate(arr));
        System.out.println(isDuplicate(arr2));
    }
}
