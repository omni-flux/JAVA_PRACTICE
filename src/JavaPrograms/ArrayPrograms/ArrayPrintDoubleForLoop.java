package JavaPrograms.ArrayPrograms;

public class ArrayPrintDoubleForLoop {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2};
        for (int i = 0;i< arr.length;i++){
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i]+" "+arr[j]);
                System.out.println();

            }
        }
    }
}
