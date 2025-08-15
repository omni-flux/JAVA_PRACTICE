package JavaPractice;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr2= {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" | ");
            sum+=arr2[i];
        }
        System.out.println();
        System.out.println("the sum is:"+ sum);
        int avg = sum/ arr2.length;
        System.out.println("The average is:"+ avg);
        // excluding conners
        // sum of even
        //sum of odd
        //largest smallest
    }
}
