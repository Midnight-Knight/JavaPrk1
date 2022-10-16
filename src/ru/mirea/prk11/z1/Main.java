package ru.mirea.prk11.z1;
import java.util.Calendar;

public class Main {
    public static void main(String[] args)
    {
        int year = 2022;
        int month = 10;
        int day = 10;
        int hour = 12;
        int minute = 15;
        int second = 30;
        System.out.printf("Фамилия: Деев Год: %s Месяц: %s День: %s Час: %s Минут: %s Секунд: %s%n",year,month,day,hour,minute,second);
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        System.out.printf("Год: %s Месяц: %s День: %s Час: %s Минут: %s Секунд: %s%n",year,month,day,hour,minute,second);
    }
}
