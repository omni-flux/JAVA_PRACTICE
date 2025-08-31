package JavaPrograms.OOPPrograms;

class Bike{
    int cc;
    double milage;
    void drive(){
        System.out.println("Driving bike with"+cc+"cc and "+milage+" milage");
    }
}

public class BikeClass {
    public static void main(String[] args) {
        Bike ktm = new Bike();
        ktm.cc = 350;
        ktm.milage = 40.0;
        ktm.drive();

        Bike re = new Bike();
        re.cc = 650;
        re.milage = 16;
        re.drive();
    }
}
