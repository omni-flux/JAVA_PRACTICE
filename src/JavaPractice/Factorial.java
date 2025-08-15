package JavaPractice;

class Factorial{
    static int fact(int n){
        int fact = 1;
        while(n>=1){
            fact*=n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;n--){
            System.out.println(n+" factorial is "+fact(n));
        }
    }
}
