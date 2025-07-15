package Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int[] intArray2 = new int[10];
        intArray2[0] = 15;
        intArray2[1] = 20;
        String[] charArray = {"GG", "WP"};
        System.out.println("integer Array" + " " + intArray);
        System.out.println("Char Array" + " " + charArray);
        for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);}

        for (int j = 0; j < charArray.length; j++) {
                System.out.println(charArray[j]);
            }

        for(int i = intArray.length - 1; i >= 0; i--){
            System.out.println(intArray[i]);
        }
        int sum = 0;
        for(int i = 0; i < intArray.length; i++){
            sum = sum + intArray[i];
        }
        System.out.println(sum);
        }
    }
