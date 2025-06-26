import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to search in the array: ");
        int value = sc.nextInt();
        int index = search(arr,value);
        boolean present = search2(arr,value);
        System.out.println(index);
        System.out.println(present);
    }
    static int search(int[] arr, int value){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == value){
                return i;
            }
        }
        return -1;
    }
    static boolean search2(int[] arr, int value){
        if(arr.length == 0){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == value){
                return true;
            }
        }
        return false;
    }
}
