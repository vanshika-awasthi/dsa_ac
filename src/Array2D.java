import java.util.Arrays;
import java.util.Scanner;
public class Array2D{
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}  
        };
        System.out.println("2D array: "+ Arrays.deepToString(matrix));
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of the rows in the 2D array: ");
        int n = sc.nextInt();
        int[][] arr = new int [n][];
        for(int i=0; i <n;i++){
            System.out.println("Enter the number of columns in row: " +(i+1));
            int m = sc.nextInt();
            arr[i] = new int[m];
            System.out.println("Enter the elements of row " + (i+1) + ":");
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array entered by the user: " + Arrays.deepToString(arr));
        System.out.println("2D Array entered by the user: ");

        // Printing the 2D array using different methods
        
        /*for(int i=0;i<n;i++){ 
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
         
        /*for(int[] num : arr){ 
            for(int j=0;j<num.length;j++){
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }*/

        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}