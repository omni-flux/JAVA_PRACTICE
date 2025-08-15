package JavaPractice;

public class Square {
    static int square(int n){
        return n*n;
    }

    public static void main(String[] args) {
        for (int a=1;a<=5;a++){
            System.out.println(a+" square: "+square(a));
        }
    }
}
