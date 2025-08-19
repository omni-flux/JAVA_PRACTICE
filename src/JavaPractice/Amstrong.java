package JavaPractice;

public class Amstrong {
    static int digitcount(int n){
        int c=0;
        while(n!=0){
            n/=10;
            c++;
        }
        return c;
    }
    static int power(int base,int ex){
        int product= 1;
        for(int i=1;i<=ex;i++){
            product*=base;
        }
        return product;
    }
    public static void main(String[] args) {
        int n= 1634, temp = n;
        int ex=digitcount(n);
        int rem=0,sum=0;

        while(n!=0){
            rem=n%10;
            sum+=power(rem,ex);
            n/=10;
        }

        System.out.println(sum==temp?"amstrong":"not amstrong");

    }
}
