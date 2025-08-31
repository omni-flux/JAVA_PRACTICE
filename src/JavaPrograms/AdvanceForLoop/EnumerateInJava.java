package JavaPrograms.AdvanceForLoop;

public class EnumerateInJava {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,4,5,4};
        int i = 0;
        int[] arr1 = new int[arr.length];
        for(int x:arr){
            System.out.println("ele at index "+i+" is "+x);
            arr1[i] = x;
            i++;
        }
        for(int x:arr1){
            System.out.print(x+" ");
        }
    }
}