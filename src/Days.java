import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter between 1 and 7 to get the day of the week: ");
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("It's a weekday.");
            case 6, 7 -> System.out.println("It's the weekend.");
            default -> System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}
