package practicalTask2;

public class JamesBondCar extends Car {

    public int drive(int howLong) {
        int distance = howLong * 180;

        if (howLong == 0) {
            System.out.println("Решили никуда не ехать.");
        } else if (howLong == 1) {
            System.out.println("Пролетели " + distance + " километров за "
                    + howLong + " час! Все камеры собрали!");
        } else if (howLong > 1 && howLong < 5) {
            System.out.println("Пролетели " + distance + " километров за "
                    + howLong + " часа! Все камеры собрали!");
        } else if (howLong > 4 && howLong < 16) {
            System.out.println("Пролетели " + distance + " километров за "
                    + howLong + " часов! Все камеры собрали!");
        } else if (howLong > 15) {
            System.out.println("Нельзя так долго ехать за рулем! Нужно отдыхать!");
        } else {
            System.out.println("Машину времени еще не изобрели!");
        }
        System.out.println(" ");
        return distance;
    }
}
