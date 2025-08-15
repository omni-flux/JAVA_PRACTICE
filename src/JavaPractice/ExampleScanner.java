package JavaPractice;

import java.util.Scanner;
public class ExampleScanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number :-");
        int val = scn.nextInt();
        System.out.println("value: "+val);
    }
}
