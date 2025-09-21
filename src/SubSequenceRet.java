
import java.util.ArrayList;

public class SubSequenceRet {
    public static void main(String[] args) {
        System.out.println(subseqret("", "abc"));
    }
    static ArrayList<String> subseqret(String p, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subseqret(p+ch, str.substring(1));
        ArrayList<String> right = subseqret(p, str.substring(1));

        left.addAll(right);
        return left;
    }
}
