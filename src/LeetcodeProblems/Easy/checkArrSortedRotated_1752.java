package LeetcodeProblems.Easy;

public class checkArrSortedRotated_1752 {
    static boolean checkSortedRotated(int arr[]){
        int count = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                count++;
            }
        }
        if(arr[0] < arr[arr.length -1]){
            count++;
        }
        if(count > 1)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int test1[]= {3,4,5,1,2};
        int test2[] = {2,1,3,4};
        boolean restest1 = checkSortedRotated(test1);
        boolean restest2 = checkSortedRotated(test2);
        System.out.println("Test 1 " + restest1);
        System.out.println("Test 2 " + restest2);
    }
}
