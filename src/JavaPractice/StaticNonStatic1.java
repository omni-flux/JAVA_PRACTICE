package JavaPractice;

class Example2{
    static int x = 43;
    char ch = 'p';
    static int mul(int a,int b){
        return a*b;
    }
    void play(){
        System.out.println("hello this is a non static method...");
    }
}

public class StaticNonStatic1 {
    public static void main(String[] args) {
        Example2 ex2 = new Example2();
        System.out.println(ex2.ch);
        System.out.println(Example2.x);
        ex2.play();
        System.out.println(Example2.mul(21,33));
    }
}
