public class RecursionProb {
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello World");
        print(n-1);
    }
    public static void main(String[] args){
        print(5);
    }
}

