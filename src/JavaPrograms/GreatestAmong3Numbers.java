package JavaPrograms;
import java.util.Scanner;

public class GreatestAmong3Numbers {
    public static void main(String[] args) {
        System.out.println("enter three numbers");
        Scanner sn = new Scanner(System.in);
        int n1 = sn.nextInt();
        int n2 = sn.nextInt();
        int n3 = sn.nextInt();

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
