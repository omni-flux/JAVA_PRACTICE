package JavaPractice;

public class LargestInTheArray {
    public static void main(String[] args) {
        int[] arr={10,32,44,4,5,55,7,99,9,10};
        int larger=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>larger){
                larger = arr[i];
            }
        }
        System.out.println(larger);
    }
}
