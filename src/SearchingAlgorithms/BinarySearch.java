package SearchingAlgorithms;

class BinDemo{
    public int search(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] == target) return mid;
            else if (target > arr[mid]) {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8,9,10,11,13};
        BinDemo binSearch = new BinDemo();
        int ans = binSearch.search(arr,-8);
        if(ans == -1)
            System.out.println("Element Not found");
        else
            System.out.println("Element found at " + ans);
    }
}

