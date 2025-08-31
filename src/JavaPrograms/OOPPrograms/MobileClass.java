package JavaPrograms.OOPPrograms;

class Mobile{
    String model;
    double price;
    void call(){
        System.out.println("calling in"+model);
    }
    void message(){
        System.out.println("message in"+model+" its price is "+price+" lakhs");
    }
}

public class MobileClass {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.model = "Iphone Ultra Pro Max";
        m1.price = 1.5;
        m1.call();
        m1.message();

        Mobile m2 = new Mobile();
        m2.model = "Samsung s25 ultra";
        m2.price = 2.5;
        m2.call();
        m2.message();
    }
}
