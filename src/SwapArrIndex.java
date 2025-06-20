import java.util.Arrays;
import java.util.Scanner;
public class SwapArrIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the first index to swap: ");
        int index1 = sc.nextInt();
        System.out.println("Enter the second index to swap: ");
        int index2 = sc.nextInt();
        System.out.println("The original array is: " + Arrays.toString(arr));
        swap(arr, index1, index2);
        System.out.println("The array after swapping is: " + Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
