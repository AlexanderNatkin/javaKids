package practicalTask3;

// Конвертация баллов в оценки по системе A, B, C, D.

public class ReportCard {
    public static void main(String[] args) {
        // так как метод статический, чтобы его вызвать, создавать объект класса не нужно
        char yourGrade = convertGrades(96);
        System.out.println("Ваша первая оценка " + yourGrade);
        yourGrade = convertGrades(81);
        System.out.println("Ваша вторая оценка " + yourGrade);
    }
    public static char convertGrades(int testResult) { // делаем метод статическим
        char grade;
        if (testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80) {
            grade = 'B';
        } else if (testResult >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }
}
