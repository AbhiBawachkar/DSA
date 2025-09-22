package LeetcodeProblems.Easy;

public class LongestSubarrayWithSumKBF {

    public static int getLongestSubarray(int[] arr, long k) {
        int n = arr.length; // size of the array.

        int maxSubArrayLen = 0;
        for(int i = 0; i < n; i++){
            int sumSubArray = 0;
            for(int j = i; j < n; j++){
                sumSubArray += arr[j];

                if(sumSubArray == k){
                    maxSubArrayLen = Math.max(maxSubArrayLen, j - i + 1);
                }
            }
        }
        return maxSubArrayLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

}
