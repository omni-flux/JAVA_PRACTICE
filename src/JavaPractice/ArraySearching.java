package JavaPractice;

public class ArraySearching {
    public static void main(String[] args) {
        int[] arr={1,2,34,14,56,17,12,50};
        int value = 50;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
           if(arr[i]==value){
               System.out.println(value+" found at index "+i);
               flag = true;
           }
        }
        if(!flag){
            System.out.println(value+" not found");
        }
    }
}
