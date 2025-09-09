package LeetcodeProblems;
import java.util.Arrays;
public class ReverseArray {

    public static void reverse(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
// Swapping with 3rd / temperory variable
//            int temp = arr[s];
//            arr[s] = arr[e];
//            arr[e] = temp;

// Swapping with no extra variable
            arr[s] = arr[s] + arr[e];
            arr[e] = arr[s] - arr[e];
            arr[s] = arr[s] - arr[e];
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
