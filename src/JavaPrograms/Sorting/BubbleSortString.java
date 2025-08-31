package JavaPrograms.Sorting;

public class BubbleSortString {
    public static String BubleSortString(String s){
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    char temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String ans = new String(arr);
        return ans;
    }
    public static void main(String[] args) {
        String s = "jihgfedcba";
        String ans = BubleSortString(s);
        System.out.println(ans);

    }

}
