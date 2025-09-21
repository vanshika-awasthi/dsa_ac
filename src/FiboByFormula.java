import java.util.Scanner;
public class FiboByFormula {
    static int fiboFormula(int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n)) / Math.sqrt(5));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i< n; i++){
            System.out.println(fiboFormula(i));
        }
    }
}
