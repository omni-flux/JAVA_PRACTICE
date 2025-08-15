package JavaPractice;

public class StringMethod {
    public static void main(String[] args) {
        String str1 ="Developers";

        //charAt() gets the char at the index
        System.out.println(str1.charAt(4));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(3));

        //length() gets the length of the string
        System.out.println("length of string:"+str1.length());

        //toCharArray() internally creates and char array for the equivalent String
        char[] s2 = str1.toCharArray();
        for(int i = 0;i<s2.length;i++){
            System.out.print(s2[i]+" ");
        }

        //indexOf() and lastIndexOf() return the index of the char taken or else if not found return -1
        System.out.println();
        System.out.println(str1.indexOf("e"));
        System.out.println(str1.indexOf("x"));

        //to find the second occurance of e
        int a = str1.indexOf("e");
        int b = str1.indexOf("e",a+1);
        System.out.println("the second occurance of e is at:"+b);

        //lastIndexOf()
        System.out.println(str1.lastIndexOf("e"));
        // second last element

        int v = str1.lastIndexOf("e");
        int c = str1.lastIndexOf("e",v-1);






    }
}
