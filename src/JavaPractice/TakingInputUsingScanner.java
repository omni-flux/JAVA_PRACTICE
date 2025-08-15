package JavaPractice;

import java.util.Scanner;
public class TakingInputUsingScanner {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n1= ip.nextInt();
        int n2= ip.nextInt();
        int n3= ip.nextInt();
        System.out.println(n1>n2?n1:n2>n3?n2:n3);
    }
}
