package LeetcodeProblems.Easy;

public class FindMissingNumberBF {
    static int Finding(int[] arr){
        int arrSum = 0;
        for(int i = 0; i < arr.length; i++){
            arrSum = arrSum + arr[i];
        }
        int sum = arr.length * (arr.length + 1) / 2;
        return sum - arrSum;

    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int[] nums2 = {0,1,2,3,5,6,7};
        System.out.println(Finding(nums2));

    }
}
