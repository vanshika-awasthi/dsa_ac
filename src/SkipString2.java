public class SkipString2 {
    public static void main(String[] args) {
        System.out.println(skipString("bacdapplecdehapp"));
    }
    static String skipString(String str){
        if(str.isEmpty()){
            return " ";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipString(str.substring(3));
        }
        else{
            return str.charAt(0)+skipString(str.substring(1));
        }
    }
}
