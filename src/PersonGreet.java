import java.util.Scanner;
public class PersonGreet {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Enter your greeting message:");
    String message = sc.nextLine();

    String fullgreet = greet(name, message);
    System.out.println(fullgreet);
  }

  static String greet(String name, String message){
    String fullGreeting = "Hello " + name + ", " + message;
    return fullGreeting;
  }
}
 