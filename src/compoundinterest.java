import java.util.Scanner;
public class compoundinterest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time period in years: ");
        double time = scanner.nextDouble();
    }
}