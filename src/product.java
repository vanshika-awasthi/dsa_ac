import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first float number: ");
        float a = scanner.nextFloat();
        System.out.println("Enter second float number: ");
        float b = scanner.nextFloat();
        float product = a*b;
        System.out.println("Product of "+ a+  "and " + b + " is: " + product);
    }
}
