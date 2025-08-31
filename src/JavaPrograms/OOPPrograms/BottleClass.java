package JavaPrograms.OOPPrograms;

class Bottle {
    int capacity;
    void fill(){
        System.out.println("filling bottle with capacity "+capacity);
    }
    void clean(){
        System.out.println("cleaning bottle with capacity "+ capacity);
    }
}

public class BottleClass {
    public static void main(String[] args) {
        Bottle milton = new Bottle();
        milton.capacity = 5;
        milton.fill();


    }
}
