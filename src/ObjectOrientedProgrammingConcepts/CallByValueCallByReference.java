package ObjectOrientedProgrammingConcepts;

public class CallByValueCallByReference {

    public static void main(String[] args) {
        CallByValueCallByReference v=new CallByValueCallByReference();
        v.sum(10,20);

    }

    public int sum(int x,int b){
        int c=x+b;
        return c;
    }
}
