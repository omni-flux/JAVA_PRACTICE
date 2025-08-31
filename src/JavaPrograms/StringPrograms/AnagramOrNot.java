package JavaPrograms.StringPrograms;
import JavaPrograms.Sorting.BubbleSortString;

public class AnagramOrNot {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "elloh";

        BubbleSortString bss = new BubbleSortString();

        String ans1 = bss.BubleSortString(s1);
        String ans2 = bss.BubleSortString(s2);

        if(ans1.equals(ans2)){
            System.out.println("Anagram!!");
        }
        else{
            System.out.println("not a anagram");
        }

    }
}
