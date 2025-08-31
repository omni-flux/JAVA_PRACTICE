package JavaPrograms.OOPPrograms;

class Employee{
    int eid;
    double ctc;
    void work(){
        System.out.println(eid+" is working the ctc is "+ctc);
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.eid = 101;
        e1.ctc = 4.5;
        e1.work();

        Employee e2 = new Employee();
        e2.eid = 102;
        e2.ctc = 3.4;
        e2.work();
    }
}
