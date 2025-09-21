package recursion;
import java.util.Scanner;

public class NumbersExampleRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        print(1,x);
    }

    static void print(int n, int x){
        if(n == x){
            System.out.println(x);
            return;
        }
        System.out.println(n);
        //this is last recursion call and is called Tail Recursion
        print(n+1,x);
    }
}
