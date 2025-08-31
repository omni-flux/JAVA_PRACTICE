package JavaPrograms.ArrayPrograms;

public class ArrayRotation {
    static void rotateRight(int[] arr){
        int temp = arr[arr.length-1];
        for (int i =arr.length-1; i >= 1 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    static void rotateLeft(int[] arr){
        int temp = arr[0];
        for (int i = 0; i <= arr.length-2 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,6,18,13,9,23,5,12};
        int r=3;
        for (int i = 1; i <=r ; i++) {
            rotateLeft(arr);
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
