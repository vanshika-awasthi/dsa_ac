import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check if it is an Armstrong number: ");
        int num = sc.nextInt();
        boolean isArmstrong = checkArmstrong(num);
        if(isArmstrong){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
        for(int i = 100; i< 1000; i++){
            if(checkArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean checkArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            int cube = rem*rem*rem;
            sum += cube;
            n /= 10;
        }
        return sum == original;
    }
}
