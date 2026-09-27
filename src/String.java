public class String {

    public static void printString(java.lang.String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    public static void main(java.lang.String[] args) {
        java.lang.String str = "Amit";
        printString(str);
    }
}