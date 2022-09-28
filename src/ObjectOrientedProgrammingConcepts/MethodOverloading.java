package ObjectOrientedProgrammingConcepts;

public class MethodOverloading {

    public void sum(){
        System.out.println("zero input parameter");
    }
    public void sum(int a){
        System.out.println("one input parameter");
    }
    public void sum(int b,int c){
        System.out.println("two input parameter");
    }

    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.sum();
        mo.sum(3);
        mo.sum(3,4);
    }
}
