package JavaPrograms.StringPrograms;

public class RearrangeString {
    public static void main(String[] args) {
        String s ="Hi^7788ye 89@#";
        String a = "";
        String n = "";
        String sc = "";
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='a' && ch <='z' || ch>='A' && ch<='Z'){
                a = a+ch;
            }
            else if(ch>='0' && ch<='9'){
                n = n+ch;
            }
            else{
                sc = sc+ch;
            }
        }
        System.out.println(a+n+sc);
    }
}
