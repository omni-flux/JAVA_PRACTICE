package JavaPrograms.AdvanceForLoop;

public class FindMaxandMinSumEsum {
    public static void main(String[] args) {
        int[] arr = {1,3,66,77,0,8,99};
        int max = 0,min = 0,sum=0,esum=0;

        for(int x:arr){
            if(x%2==0){
                esum+=x;
            }
            else if(x > max){
                max=x;
            }
            else if (x < min) {
                min = x;
            }
            else{
                sum+=x;
            }
        }

        System.out.println("max:"+max+" min:"+min);
    }
}
