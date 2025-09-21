public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);

        //Common StringBuilder Operations 
        //Creating a StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("xyz");
        System.out.println(sb);

        //Insertion [at start index]
        sb.insert(2, "hi");
        System.out.println(sb);

        //Replace [at start index, less than end index]
        sb.replace(2, 4, "hello");
        System.out.println(sb);

        //Length and capacity
        int len = sb.length();       // current number of characters
        int cap = sb.capacity();     // internal buffer size
        System.out.println(len + " " + cap);

        //Reverse
        builder.reverse();
        System.out.println(builder);

        //Convert back to String
        String str = builder.toString();
        System.out.println(str);
    }
}
