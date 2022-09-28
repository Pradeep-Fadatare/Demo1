package ObjectOrientedProgrammingConcepts;

public class WrapperClass {
    public static void main(String[] args) {
        String x="100";
        System.out.println(x+20);

        int X=Integer.parseInt(x);
        System.out.println(X);
        System.out.println(X+20);

        //Double,Character,Boolean
        //String to Double Conversion

        String st="12.33";
        double d=Double.parseDouble(st);
        System.out.println(d);
        //String to boolean
        String a="true";
        boolean b=Boolean.parseBoolean(a);
        System.out.println(b);

        //int to string
        int j=1000;
        System.out.println(j+20);
        String t=String.valueOf(j);
        System.out.println(t+30);

        String u="100A";
        Integer.parseInt(u);

    }
}
