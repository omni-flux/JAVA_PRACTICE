package JavaPractice.Constructor;


class Container {
    int capacity;
    Container(int arg){
        capacity = arg;
    }
}

public class ParametarisedConstructor {
    public static void main(String[] args) {
        Container c1 = new Container(5000);
        System.out.println(c1.capacity);
        Container c2 = new Container(2500);
        System.out.println(c2.capacity);
        Container c3 = new Container(7000);
        System.out.println(c3.capacity);
    }

}
