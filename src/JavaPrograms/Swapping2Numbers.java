package JavaPrograms;

public class Swapping2Numbers {
    public static void main(String[] args) {
        //before swapping
        int a = 2;
        int b = 55;
        System.out.println("before swapping");
        System.out.println("a:"+a+"    b:"+b);

        //swapping using xor (^)
        a = a^b;
        b = a^b;
        a = a^b;

        //swapping using arithematic operaator
//        a = a+b;
//        b = a-b;
//        a = a-b;

        System.out.println("after swapping");
        System.out.println("a:"+a+"   b:"+b);

    }
}



