package JavaPrograms.OOPPrograms;

class Email{
    String from;
    String to;
    void compose(){
        System.out.println(from+" wrote a email to"+to);
    }
    void readEmail(){
        System.out.println(to+"read a email from"+from);
    }
}

public class EmailClass {
    public static void main(String[] args) {
        Email e1 = new Email();
        e1.from = "ommkar@gmail.com";
        e1.to = "aishujain@gmail.com";
        e1.compose();
        e1.readEmail();
    }
}
