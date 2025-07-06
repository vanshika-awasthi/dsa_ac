import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2DArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows in the 2D array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns in the 2D array: ");
        int m = sc.nextInt();
        int[][] arr = new int [n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array entered by the user: " + Arrays.deepToString(arr));
        System.out.println("Enter the element to find: ");
        int target = sc.nextInt();
        int[] result = search(arr, target);
        System.out.println("The index at which the element is found: "+Arrays.toString(result));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[] {row, col};
            }
            if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}