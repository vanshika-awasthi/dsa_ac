import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the word: ");
        String name = sc.nextLine();
        System.out.println("Enter the character to find in the string given: ");
        char target = sc.next().charAt(0);
        boolean present = search(name,target);
        System.out.println(present);
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
