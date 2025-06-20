public class Sumoverloading {
    public static void main(String[] args) {
        int ans = sum(10,20);
        //int ans = sum(10,20,30);
        System.out.println(ans);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
