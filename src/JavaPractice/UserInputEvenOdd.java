package JavaPractice;

import java.util.Scanner;
public class UserInputEvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        int n = scn.nextInt();

        if(n%2==0){
            System.out.println(n+"is a Even number");
        }
        else{
            System.out.println(n+"is a Odd number");
        }
    }
}
