package JavaPrograms.StringPrograms;

public class VowelsString {
    public static void main(String[] args) {
        String s = "AppleOO";
        char ch;
        s = s.toLowerCase();
        int c =0;
        for (int i = 0; i < s.length() ; i++) {
            ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c++;
            }
        }
        System.out.println("the no of vowels in "+"'"+s+"'"+" is: "+c);
    }
}
