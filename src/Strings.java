
import java.util.Arrays;
public class Strings {
    public static void main(String[] args) {

        //toString() method
        int[] arr = {2, 3, 5, 4, 19};
        Integer num = 10;
        String name = "Kunal Kushwaha";
        System.out.println(name);

        System.out.println(Arrays.toString(arr));
        System.out.println(num.toString());
        String c = "Kunal";
        System.out.println(c);
        c = "Kushwaha";
        System.out.println(c);

        //Pretty Printing and format-specifiers
        float x = 453.1234f;
        float y = 453.1237f;
        System.out.printf("Formatted number is %.3f", x);
        System.out.println();
        System.out.printf("Formatted number is %.3f", y);
        System.out.println();

        System.out.println(Math.PI);
        System.out.printf("Pie value round-off to 4 decimal places: %.4f", Math.PI);
        System.out.println();

        System.out.printf("Hello my name is %s and I am %s.", "Vanshika", "smart");

        //Operators in String
        //Concatenation Operator (+)
        String first = "Hello";
        String second = "World";
        String result = first + " " + second;
        System.out.println(result);
        int age = 25;
        System.out.println("Age is " + age);

        System.out.println((char)('a' + 3)); //(char) will return alphabet value only -> (97+3 = 100 -> d); without (char) it will return (97+3 -> 100)
        System.out.println("a" + 1);

        //Concatenation Assignment Operator (+=)
        String message = "Hello";
        message += " World";
        System.out.println(message); 

        //Comparison Operators (== vs .equals() method)
        String a = "Kunal";
        String b = a;
        System.out.println(a == b); 
        System.out.println(a.equals(b));

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        System.out.println(name1 == name2); //checks if reference variables are pointing to same object
        System.out.println(name1.equals(name2)); //only checks the value of the two reference variables

        //Relational Operator (used to compare the size of 2 strings)
        String fruit1 = "apple";
        String fruit2 = "banana";
        System.out.println(fruit1.compareTo(fruit2)); 

        //String Performance
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            //System.out.println(ch);
            series = series + ch; // series += ch
        }
        System.out.println(series);
    }
}

