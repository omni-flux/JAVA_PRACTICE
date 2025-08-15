package JavaPractice;

public class FactorialUsingRecursion {
    static void factorial(int n,int fact){
        int temp = n;
        if(n>=1){
            fact*=n;
            n--;
            factorial(n,fact);
        }
        else{
            System.out.println(temp+" factorial is :- "+fact);
        }
    }
    public static void main(String[] args) {
        factorial(5,1);
    }
}
