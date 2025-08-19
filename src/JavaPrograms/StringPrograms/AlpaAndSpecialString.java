package JavaPrograms.StringPrograms;

public class AlpaAndSpecialString {
    public static void main(String[] args) {
        String s = "QWERqwet23@#@$$@#@!";
        char ch;
        s = s.toLowerCase();
        int c =0;
        for (int i = 0; i < s.length() ; i++) {
            ch = s.charAt(i);

            if( (ch>=97 && ch<=122) || (ch>=33 && ch<=47) || (ch>=58 && ch<=64) ){
                c++;
            }

        }
        System.out.println(c);
    }
}
