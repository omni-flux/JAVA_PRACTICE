package JavaPrograms;
import java.util.Scanner;

public class GreatestAmong3Numbers {
    public static void main(String[] args) {
        int n1 = 30;
        int n2 = 10;
        int n3 = 90;

        if(n1>n2 && n1>n3){
            System.out.println(n1);
        }
        else if(n2>n3){
            System.out.println(n2);
        }
        else {
            System.out.println(n3);
        }

//        System.out.println((n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3));

    }
}
