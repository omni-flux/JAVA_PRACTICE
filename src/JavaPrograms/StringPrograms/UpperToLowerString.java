package JavaPrograms.StringPrograms;

public class UpperToLowerString {
    public static void main(String[] args) {
        String s = "Apple Hi9877 Bye HELoo";
        char ch;
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                ch-=32;
            }
            else if(ch>='A' && ch<='Z'){
                ch+=32;
            }
            System.out.print(ch);
        }
    }
}
