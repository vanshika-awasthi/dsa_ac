public class Overloading {
    public static void main(String[] args) {
        fun("Hello", 555);
        fun(600, 40, "World");
    }
    static void fun(String str, int num){
        System.out.println(str +" "+ num);
    }
    static void fun(int num1, int num2, String str){
        System.out.println(num1 +" "+ num2 +" "+ str);
    }
}
