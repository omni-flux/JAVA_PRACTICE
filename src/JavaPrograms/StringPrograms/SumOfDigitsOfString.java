package JavaPrograms.StringPrograms;

public class SumOfDigitsOfString {
    public static void main(String[] args) {
        String s ="hello1hello2hello3";
        char ch;
        int sum = 0;
        for (int i = 0; i < s.length() ; i++) {
            ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                sum += (ch - 48);
            }

        }
        System.out.println(sum);
    }
}
