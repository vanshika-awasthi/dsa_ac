public class Shadowing {
    static int x = 90;
    public static void main(String[] args){
        System.out.println("The value of x in main is: "+x);
        x = 40;
        System.out.println("The value of x in main after shadowing is: "+x);
        display();
    }
    static void display(){
        int x = 20;
        System.out.println("The value of x in display is: "+x);
    }
}
