package JavaPractice;

// printing 1 to 5
//public class JavaBascis.Recursion {
//    static void display(int a){
//        System.out.println(a);
//        if (a<5){
//            a++;
//            display(a);
//        }
//    }
//    public static void main(String[] args) {
//        display(1);
//
//    }
//}
// printing 5 to 1
 public class Recursion {
     static void display(int a){
         System.out.println(a);
         if (a>1){
             a--;
             display(a);
         }
     }
     public static void main(String[] args) {
         display(5);

     }
 }

