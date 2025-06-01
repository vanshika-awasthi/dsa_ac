import java.util.Scanner;
public class perimeter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.println("Enter the breadth of the rectangle: ");
            double breadth = scanner.nextDouble();
            double perimeter = 2*(length + breadth);
            System.out.println("The perimeter of the rectabgle is: "+ perimeter);
    }
    
}
