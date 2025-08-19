package HackerRankQuestions;
import java.util.Scanner;

public class PrimeGroupOrNot {
    static boolean primeOrNot(int num){
        int count = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                count++;
            }
            if(count>2) {
                break;
            }
        }
        return num > 1 && count < 2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            int a = s.nextInt();
            arr[i] = a;
        }

        int max = arr[0];
        int min= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        boolean pG = primeOrNot(max-min);
        System.out.println(pG?"prime group":"not a prime group");
    }
}
