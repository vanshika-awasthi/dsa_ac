import java.util.Scanner;

public class SumFunc{
    public static void main(String[] args){
        sum();
        sum();
        int subresult = sub();
        System.out.println("The result of subtraction is: "+ subresult);
        int mulresult = multi(15,10);
        System.out.println("The result of multiplication is: "+ mulresult);
    }

    static void sum(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers to sum: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: "+ sum);
    }

    //function to subtract two numbers with return type
    static int sub(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers to subtract: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int subtract = num1 - num2;
        return subtract;
    }

    //giving parameters to the function
    static int multi(int x, int y){
        return x*y;
    }
} 
    
