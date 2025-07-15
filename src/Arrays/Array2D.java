package Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[4][4]; //Declaring 2d Array
        int[][] nums = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
/*
In order to travers 2d array we require nested loop i and j.
And in order to print first we need to give row and then column
nums[1][2] - So in this it will first go to row no 2, and then it will
go to the column 3 and get the value 7
 */
        System.out.println("Sample value"+ " " + nums[1][2]);
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                System.out.print(nums[i][j] + "|");
            }
            System.out.println();
        }

    }
}
