package DataStructures.HackerRankQuestions;

/*
* Input will be a number.Your task is to check the given number is Armstrong or not.A number is said to be Armstrong number if the sum of power of the count of digit is a number.For example 153 .1^3+5^3+3^3=153

Input Format

int->153

Constraints

....

Output Format

String->Armstrong No

Sample Input 0

1634
Sample Output 0

Armstrong No
Explanation 0

1^4+6^4+3^4+4^4

Sample Input 1

123
Sample Output 1

Not A Armstrong No
Explanation 1

1^3+2^3+3^3=36.*/


import java.io.*;
import java.util.*;

public class AmstrongNoOrNOT {
    static int countdigits(int num){
        int c = 0;
        while(num!=0){
            num/=10;
            c++;
        }
        return c;
    }
    static int powerOf(int base,int ex){
        int prod =1;
        for(int i=1;i<=ex;i++){
            prod*=base;
        }
        return prod;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int rem = 0,sum =0;
        int count = countdigits(n);
        int temp = n;

        while(n!=0){
            rem = n%10;
            sum+=powerOf(rem,count);
            n/=10;
        }
        if(temp == sum){
            System.out.print("Armstrong No");
        }
        else{
            System.out.print("Not A Armstrong No");
        }
    }
}
