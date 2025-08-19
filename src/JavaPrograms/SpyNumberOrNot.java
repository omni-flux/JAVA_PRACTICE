package JavaPrograms;

public class SpyNumberOrNot {
    public static void main(String[] args) {
        // a number is a spy number is the sum and product of its digits are same.
        int n = 112,c=1,sum=0,prod=1,temp=n;

        while(n!=0){
            c = n%10;
            sum+=c;
            prod*=c;
            n/=10;
        }

        if(sum==prod){
            System.out.println(temp+" is a spy!!!!....");
        }
        else{
            System.out.println("not a spy no");
        }
    }
}
