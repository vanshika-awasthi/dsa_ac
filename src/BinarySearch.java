import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("Enter the number whose index needs to be searched: ");
        int target = sc.nextInt();
        int result = binarysearch(arr,target);
        System.out.println(result);
    }

    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
