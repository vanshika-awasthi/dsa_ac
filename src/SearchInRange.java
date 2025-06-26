import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find: ");
        int target = sc.nextInt();
        System.out.println("Enter the search range in the array: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean present = search(arr,target,start,end);
        System.out.println(present);
    }
    static boolean search(int[] arr, int target, int start, int end){
        if(arr.length==0 || start>end || start<0 ){
            return false;
        }
        for(int i=start; i<=end; i++){
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
