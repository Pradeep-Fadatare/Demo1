package ObjectOrientedProgrammingConcepts;

public class FunctionORMethods {
    //Non static Methods
    public static void main(String[] args) {
        FunctionORMethods fm=new FunctionORMethods();
        fm.test();
        int b=fm.div(5,10);
        System.out.println(b);
        String s=fm.out();
        System.out.println(s);
        int a=fm.pqr();
        System.out.println(a);
    }
    public void test(){

    }

    public int pqr(){
        System.out.println("PQR Method");
        int a=10;
        int b=20;
        int c=a+b;

        return c;
    }

    public String out(){
        System.out.println("OUT method");
        String s= "pradeep";
        return s;
    }

    public int div(int x, int y){
        System.out.println("Division method");
        int d=x/y;
        return d;
    }
}
