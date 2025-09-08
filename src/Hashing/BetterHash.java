package Hashing;
import java.util.HashMap;
import java.util.Map;

public class BetterHash {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,1,1,2,3,6,0,-1,100,3,1,100,100};

        // Use HashMap to handle any range of numbers, including negatives
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print frequency of each unique number
        System.out.println("Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + " appears " + entry.getValue() + " times.");
        }

        // Find and display the most frequent number(s)
        int maxFreq = 0;
        for (int count : frequencyMap.values()) {
            if (count > maxFreq) {
                maxFreq = count;
            }
        }

        System.out.print("Most frequent number(s): ");
        boolean first = true;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                if (!first) System.out.print(", ");
                System.out.print(entry.getKey());
                first = false;
            }
        }
        System.out.println(" (appeared " + maxFreq + " times)");
    }
}
