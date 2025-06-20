import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class trail2D {
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

        //1
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //2
        for (int i = 0; i < n; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
