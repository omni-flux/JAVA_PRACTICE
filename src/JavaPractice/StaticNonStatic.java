package JavaPractice;
class Example{
    int a = 80;
    char b = 'j';
    void disp(){
        System.out.println("executing disp...");
    }
    void help(){
        System.out.println("Executing help.....");
    }
}
public class StaticNonStatic {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.a);
        System.out.println(ex.b);
        ex.disp();
        ex.help();
    }
}
