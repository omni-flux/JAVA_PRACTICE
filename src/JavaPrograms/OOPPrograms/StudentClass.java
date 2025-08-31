package JavaPrograms.OOPPrograms;

class Student{
    String name;
    double cgpa;
    void studing(){
        System.out.println(name+" is studying");
    }
    void write(){
        System.out.println(name+" is writing the cgpa is "+cgpa);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ram";
        s1.cgpa = 8.9;
        s1.studing();
        s1.write();

        Student s2 = new Student();
        s2.name = "shyam";
        s2.cgpa = 8.9;
        s2.studing();
        s2.write();
    }
}
