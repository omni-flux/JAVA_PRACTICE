package JavaPrograms.OOPPrograms;

class Player1{
    String name;
    int jerseyNumber;
    void play(){
        System.out.println(name+" is playing the jersey number is "+jerseyNumber);
    }
}

public class PlayerClass {
    public static void main(String[] args) {
        Player1 p1 = new Player1();
        p1.name = "Rohit sharma";
        p1.jerseyNumber=45;
        p1.play();

    }
}
