/* Lets understand swap concept with an Analogy, there are 3 boxes A, B and C.
Rule is each box can hold only one item at a time.
Box A and B each contains distinct item, whereas box C is empty. 
We need to interchange the items of box A and B. Lets see how we can do this with the help of box C(introducing new varicable - temp).
** 1. First we will put the item of box A into box C(in code - temp variable).
** 2. Now we will put the item of box B into box A.
** 3. Finally we will put the item of box C into box B. 
*/ 
import java.util.Scanner;
public class swap{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        System.out.println("Before swap: a = " + a + ",b = " + b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swap: a = " + a + ",b = " + b);
        input.close();
    }
}