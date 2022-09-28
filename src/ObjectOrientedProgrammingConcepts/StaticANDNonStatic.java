package ObjectOrientedProgrammingConcepts;

public class StaticANDNonStatic {
    public int a=10;
    static int age=20;

    public static void main(String[] args) {
        sum();
        StaticANDNonStatic.sum();
        System.out.println(age);
        System.out.println(StaticANDNonStatic.age);
        StaticANDNonStatic sn=new StaticANDNonStatic();
        sn.sendMail();
        System.out.println(sn.a);
    }

    public void sendMail(){
        System.out.println("SendMAil Method");
    }
    public static void sum(){
        System.out.println("Sum MEthod");
    }
}
