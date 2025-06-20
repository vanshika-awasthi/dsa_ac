import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
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
        reverse(arr);
        System.out.println("The array after reversing is: " + Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
