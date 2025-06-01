import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter the time period: ");
        double time = scanner.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        double SI = (principal*rate*time)/100;
        System.out.println("The Simple Interest is : "+ SI);
    }  
}
