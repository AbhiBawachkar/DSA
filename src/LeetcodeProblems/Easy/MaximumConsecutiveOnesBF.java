package LeetcodeProblems.Easy;

public class MaximumConsecutiveOnesBF {
    static int maxOne(int[] arr){
        int count = 0, current = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                current ++;
                count = Math.max(count, current);
            }
            else{
                current = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(maxOne(arr));
    }
}
