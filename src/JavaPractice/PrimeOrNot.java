package JavaPractice;

public class PrimeOrNot {
    static boolean primeornot(int num){
        int a=1;
        int count=0;
        while(a<=num/2){
            if (num%a==0){
                count++;
            }
            a++;
        }
        if(count==1){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean primeOrNotV2(int num){
        /* please pass a num value > 0 */
        int count = 0;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
            }
            if(count > 2){
                break;
            }
        }
        return num>1?count<2:false;
    }
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            boolean isprime = primeornot(i);
            if(isprime){
                System.out.println(i);
            }
        }
        System.out.println(primeOrNotV2(0));
    }
}
