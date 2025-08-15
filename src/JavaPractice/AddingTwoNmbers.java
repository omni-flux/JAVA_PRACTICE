package JavaPractice;

import java.util.Scanner;
public class AddingTwoNmbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the fist number: ");
        int a = scn.nextInt();
        System.out.print("Enter the second number: ");
        int b = scn.nextInt();
        System.out.println("the sum of "+a+" and "+b+" is "+(a+b));
    }
}
