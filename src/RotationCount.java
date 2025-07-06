import java.util.Arrays;
import java.util.Scanner;

public class RotationCount{
    static int rotationCount(int[] arr){
        int pivot = findPivot(arr);
        if(pivot != -1){
            return pivot+1;
            //return countRot(arr, 0, pivot);
        }
        return 0;
    }

  /*static int countRot(int[] arr, int start, int pivot){
        int count = 0;
        for(int i=0; i<= pivot; i++){
            count++;
        }
        return count;
    }*/

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) return -1; // Already sorted, 0 rotations
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The original array is: " + Arrays.toString(nums));
        System.out.println("The number of total rotations are: " + rotationCount(nums));
    }
}