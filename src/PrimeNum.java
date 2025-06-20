import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        boolean isPrime = checkPrime(num);
        if(isPrime){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }
    
    static boolean checkPrime(int n){
        if(n <=1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
