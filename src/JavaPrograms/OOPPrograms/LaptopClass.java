package JavaPrograms.OOPPrograms;

class Laptop{
    String wallpaper="Alia.jepg";
}
// Shallow copy
public class LaptopClass {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = l1;
        System.out.println(l1.wallpaper);
        System.out.println(l2.wallpaper);
        l1.wallpaper = "kiara.jpeg";
        System.out.println(l1.wallpaper);
        System.out.println(l2.wallpaper);
    }
}
