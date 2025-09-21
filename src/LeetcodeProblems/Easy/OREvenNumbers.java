package LeetcodeProblems.Easy;

public class OREvenNumbers {

    static int BitwiseOr(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                res |= arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] testCases = {
                {1, 2, 3, 4, 5, 6},   // Expected: 6
                {7, 9, 11},           // Expected: 0
                {1, 8, 16},           // Expected: 24
                {},                   // Edge case: empty array
                {0, 2, 4},            // Includes zero
        };

        // 🔁 Loop through test cases and print results
        for (int i = 0; i < testCases.length; i++) {
            int[] testCase = testCases[i];
            int result = BitwiseOr(testCase);
            System.out.print("Test Case " + (i + 1) + ": Input = ");
            printArray(testCase);
            System.out.println(" → Output = " + result);
        }
    }

    // 📦 Utility method to print an array
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}
