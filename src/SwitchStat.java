import java.util.Scanner;
public class SwitchStat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit name: ");
        String fruit = sc.next();
        switch (fruit){
            case "apple" -> System.out.println("Apple is red in color.");
            case "banana" -> System.out.println("Banana is yellow in color.");
            case "grape" -> System.out.println("Grape is purple in color.");
            case "orange" -> System.out.println("Orange is orange in color.");
            default -> System.out.println("Unknown fruit.");
        }
    }
}
