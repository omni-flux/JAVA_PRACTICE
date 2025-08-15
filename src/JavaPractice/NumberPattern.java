package JavaPractice;

public class NumberPattern {
    public static void main(String[] args) {
        int n= 5;
        char c = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>=j){
                    System.out.print(c+" ");
                    c++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
