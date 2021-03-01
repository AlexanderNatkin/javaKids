package practicalTask2;

public class Car {
    public void start() {
        System.out.println("Запускаем двигатель......");
        System.out.println("Мотор ревёт, врубай передачу!");
        System.out.println(" ");
    }

    public void stop() {
        System.out.println("Глуши движок, приехали.");
    }

    public int drive(int howLong) {
        int distance = howLong * 60;

        if (howLong == 0) {
            System.out.println("Решили никуда не ехать.");
        } else if (howLong == 1) {
            System.out.println("Проехали " + distance + " километров за " + howLong + " час!");
        } else if (howLong > 1 && howLong < 5) {
            System.out.println("Проехали " + distance + " километров за " + howLong + " часа!");
        } else if (howLong > 4 && howLong < 16) {
            System.out.println("Проехали " + distance + " километров за " + howLong + " часов!");
        } else if (howLong > 15) {
            System.out.println("Нельзя так долго ехать за рулем! Нужно отдыхать!");
        } else {
            System.out.println("Машину времени еще не изобрели!");
        }
        System.out.println(" ");
        return distance;
    }
}
