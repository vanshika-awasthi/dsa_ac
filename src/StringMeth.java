public class StringMeth {
    public static void main(String[] args) {
        String str = "  Hello Java!  ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. trim()
        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // 3. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 4. charAt()
        System.out.println("Character at index 1: " + trimmed.charAt(1));

        // 5. substring()
        System.out.println("Substring (1 to 4): " + trimmed.substring(1, 4));

        // 6. contains()
        System.out.println("Contains 'Java'? " + trimmed.contains("Java"));

        // 7. startsWith() and endsWith()
        System.out.println("Starts with 'Hello'? " + trimmed.startsWith("Hello"));
        System.out.println("Ends with '!'? " + trimmed.endsWith("!"));

        // 8. equals() and equalsIgnoreCase()
        String other = "hello java!";
        System.out.println("Equals: " + trimmed.equals(other));
        System.out.println("EqualsIgnoreCase: " + trimmed.equalsIgnoreCase(other));

        // 9. indexOf() and lastIndexOf()
        System.out.println("Index of 'a': " + trimmed.indexOf('a'));
        System.out.println("Last index of 'a': " + trimmed.lastIndexOf('a'));

        // 10. replace()
        System.out.println("Replace 'Java' with 'World': " + trimmed.replace("Java", "World"));

        // 11. split()
        String[] parts = trimmed.split(" ");
        System.out.println("Split by space:");
        for (String part : parts) {
            System.out.println(" " + part);
        }

        // 12. toCharArray()
        char[] chars = trimmed.toCharArray();
        System.out.println("Characters in the string:");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }

        // 13. isEmpty()
        String emptyStr = "";
        System.out.println("\nIs empty string empty? " + emptyStr.isEmpty());
    }
}

