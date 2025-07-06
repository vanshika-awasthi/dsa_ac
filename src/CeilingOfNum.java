import java.util.Arrays;
import java.util.Scanner;

public class CeilingOfNum {
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
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid] < target){
                start = mid+1;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
        }
        return arr[start];
    }

}
