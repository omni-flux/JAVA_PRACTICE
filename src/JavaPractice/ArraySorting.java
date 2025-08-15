package JavaPractice;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr={1,12,4,56,70,99,3,7};
        System.out.println("before sorting");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" | ");
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if(arr[i]>arr[j]){
                   int b = arr[i];
                   arr[i] = arr[j];
                   arr[j] = b;
               }
            }
        }
        System.out.println();
        System.out.println("after sorting");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" | ");
        }
    }
}
