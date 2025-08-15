package JavaPractice;

public class ArrayDisp{
    public static void main(String[] args) {
        int[] arr1 = {2,1,4,5,6,7,8,9};
        System.out.println("printing all the numbers");
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" | ");
        }
        System.out.println();
        System.out.println("even numbers only");
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]%2==0) {
                System.out.print(arr1[i]+" | ");
            }
        }
        System.out.println();
        System.out.println("odd numbers only");
        for(int j = 0;j<arr1.length;j++){
            if(arr1[j]%2!=0) {
                System.out.print(arr1[j]+" | ");
            }
        }
        System.out.println();
        System.out.println("reversing an array");
        for(int k = arr1.length-1;k>=0;k--){
                System.out.print(arr1[k]+" | ");
        }
    }
}
