package ObjectOrientedProgrammingConcepts;

public class Car {
    int mod;
    int wheel;

    public static void main(String[] args) {
        Car c=new Car();
        Car d=new Car();
        Car b=new Car();
        c.mod=2022;
        c.wheel=4;
        b.mod=2023;
        b.wheel=5;
        d.mod=2088;
        d.wheel=7;

        System.out.println(c.mod);
        System.out.println(b.mod);
        System.out.println(d.wheel);

        c=d;
        d=b;
        b=c;

        c.mod=10;
        System.out.println(c.mod);
        d.mod=20;
        System.out.println(d.mod);
        System.out.println(c.mod);
    }
}
