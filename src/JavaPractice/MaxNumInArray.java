package JavaPractice;

public class MaxNumInArray {
    public static void main(String[] args) {
        double[] arr= {999,5,6,7,8,999,0,2,3,88,999.9};
        double largest=arr[0];
        for(int i = 0; i<arr.length ;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("largest no:" + largest);
    }
}
