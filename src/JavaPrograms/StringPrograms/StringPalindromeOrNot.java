package JavaPrograms.StringPrograms;

public class StringPalindromeOrNot {
    public static void main(String[] args) {
        String s = "level";
        String a = "";
        char ch;
        for (int i = s.length()-1; i >=0 ; i--) {
            ch = s.charAt(i);
            a = a+ch;
        }
        System.out.println(s+" : "+a);
        System.out.println(s.equalsIgnoreCase(a)?"palindrome":"not a palindrome");
    }
}
