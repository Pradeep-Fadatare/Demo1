package OOPS2;

public class TestCar {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        Car car=new Car();
        bmw.start();
        bmw.stop();
        car.start();

        Car car1=new BMW();
        car1.start();
    }
}
