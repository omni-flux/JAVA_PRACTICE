package JavaPrograms.StringPrograms;

public class RemoveExtraSpaceString {
    public static void main(String[] args) {
        String s = "d   n  ab y";
        String a ="";
        boolean flag = true;
//        for (int i = 0; i <s.length() ; i++) {
//            if(s.charAt(i)!=' ' || s.charAt(i+1)!=' '){
//                a=a+s.charAt(i);
//            }
//        }
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' ' && s.charAt(i+1)==' '){
                continue;
            }
            a = a + s.charAt(i);
        }
        System.out.println(a);
    }
}
