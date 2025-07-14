
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {-1, 7, -32, 89, 0};
        System.err.println(Arrays.toString(arr));
        bubble(arr);
        System.err.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for particular value of i, it means the array is sorted. Hence, stop the program
            if(!swapped){
                break;
            }
        }
    }
}
