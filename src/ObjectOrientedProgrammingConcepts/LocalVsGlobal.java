package ObjectOrientedProgrammingConcepts;

public class LocalVsGlobal {
    String name="Pradeep";
    int age=27;

    public static void main(String[] args) {
        int i=22;
        System.out.println(i);
        LocalVsGlobal lg=new LocalVsGlobal();
        System.out.println(lg.name);
        System.out.println(lg.age);
    }

    public void test(){
        int i=10;
        int j=20;
        int age=25;
    }
}
