package LeetcodeProblems.Medium;

public class MajorityElementOP {
    public static int majority(int[] arr){
        int count = 0;
        int element = 0;
        for(int i = 0; i < arr.length; i++){
            if(count == 0){
                count++;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            }
            else
                count --;
        }
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                cnt++;
            }
        }
        if(cnt > (arr.length/2)){
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majority(arr));

    }
}
