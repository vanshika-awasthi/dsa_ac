import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args){
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
        int result = orderAgnosticBS(arr,target);
        System.out.println(result);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
