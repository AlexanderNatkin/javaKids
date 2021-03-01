package practicalTask2;

public class CarOwner {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car superCar = new JamesBondCar();

        myCar.start();
        myCar.drive(1);
        myCar.stop();

        System.out.println(" ");

        superCar.start();
        superCar.drive(3);
        superCar.stop();
    }
}
