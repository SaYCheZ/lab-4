import java.util.GregorianCalendar;
import java.util.Calendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public String toString() {
        return String.format("%04d-%02d-%02d", year, month + 1, day);
    }

    public static void main(String[] args) {
        MyDate currentDate = new MyDate();
        System.out.println("Текущая дата: " + currentDate);

        MyDate specificDate = new MyDate(34355555133101L);
        System.out.println("Дата для указанного времени: " + specificDate);

        MyDate customDate = new MyDate(2023, 9, 5);
        System.out.println("Пользовательская дата: " + customDate);
    }
}