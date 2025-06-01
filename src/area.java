import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the breadth of the triangle: ");
        double breadth = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5*breadth*height;
        System.out.println("The area of the triangle is: " + area);
    }
}
