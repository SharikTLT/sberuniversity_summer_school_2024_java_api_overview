package e4.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

//Время и дата
public class Part3_DateTime {
    public static void main(String[] args) throws ParseException {

        Date date = new Date(); //Объект даты и времени
        System.out.println(date);
        System.out.println(date.after(new Date()));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); //Чтение и запись даты в нужном формате
        System.out.println(simpleDateFormat.format(date));


        System.out.println(simpleDateFormat.parse("2000-05-22"));


        GregorianCalendar calendar = new GregorianCalendar(); //Грегорианский и юлианский календари с правилами летнего времени и т.д.

        calendar.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        calendar.add(GregorianCalendar.MINUTE, 30);
        System.out.printf("Время через пол часа: %s:%s%n", calendar.get(GregorianCalendar.HOUR_OF_DAY), calendar.get(GregorianCalendar.MINUTE));
    }
}
