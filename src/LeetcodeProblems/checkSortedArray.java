package LeetcodeProblems;

public class checkSortedArray {
    public static boolean checkSorted(int arr[]){
        for(int i = 1; i< arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int tab[] = {1,2,4,5,7,8,-1};
        boolean res = checkSorted(tab);
        System.out.println(res);
    }
}
