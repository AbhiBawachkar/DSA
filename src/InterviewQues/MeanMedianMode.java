package InterviewQues;

import java.util.Arrays;

public class MeanMedianMode {
    public static double getMean(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length; // return as double for accuracy
    }

    public static double getMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 == 0) {
            // even length → average of two middle elements
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            // odd length → middle element
            return arr[n / 2];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 22, 43, 6, 7, 1, 78, 12};
        System.out.println("Mean: " + getMean(arr));
        System.out.println("Median: " + getMedian(arr));
    }
}
