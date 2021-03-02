package practicalTask3;

// Бытовой конвертер температуры Фаренгейт <-> Цельсий (только целые числа)

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        tc.converterTemp(-300, 'F');
        tc.converterTemp(80, 'C');
        tc.converterTemp(-459, 'C');
    }

// тип метода String по заданию, поэтому применяем конвертацию через valueOf

    public String converterTemp (int temperature, char convertTo) {
        String result;
        int value =0;

        if (convertTo == 'F' & temperature >= -273) {
            value = (temperature * 9/5) + 32;
            System.out.println("Температура: " + value + " °F");
        } else if (convertTo == 'C' & temperature >= -459) {
            value = (temperature - 32) * 5/9;
            System.out.println("Температура: " + value + " °C");
        } else {
            System.out.println("Введите корректные данные");
        }

        result = String.valueOf(value); // приводим тип Value к String
        return result;
    }
}

