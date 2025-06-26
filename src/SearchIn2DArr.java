
import java.util.Arrays;
import java.util.Scanner;
public class SearchIn2DArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
