package InterviewQuestions;

public class SWapNumbersDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //System.out.println(a+"------"+b);

        //Without using third variable
        int t=a;
        a=b;
        b=t;
        System.out.println(a);
        System.out.println(b);

        //Using + & - operator
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

        //Using Multiplication and division operations a/b!=0;
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a);
        System.out.println(b);

        //Bitwise XOR operator
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);

        //Single Statement
        b=a+b-(a=b);
        a=a+b-(b=a);
        System.out.println("new"+a);
        System.out.println("new"+b);
    }
}
