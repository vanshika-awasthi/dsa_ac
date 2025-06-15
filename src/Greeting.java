import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your greeeting message: ");
        String greet= sc.nextLine();
        return greet;
    }
}
