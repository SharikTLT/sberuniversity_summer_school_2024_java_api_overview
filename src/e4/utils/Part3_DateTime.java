package e4.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
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


        Instant now = Instant.now();
        now.get(ChronoField.DAY_OF_YEAR);
        now.get(ChronoField.DAY_OF_MONTH);
        now.get(ChronoField.HOUR_OF_DAY);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(formatter.format(now));
        System.out.println(formatter.parse("2025-01-01"));


        GregorianCalendar calendar = new GregorianCalendar(); //Грегорианский и юлианский календари с правилами летнего времени и т.д.

        calendar.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        calendar.add(GregorianCalendar.MINUTE, 30);
        System.out.printf("Время через пол часа: %s:%s%n", calendar.get(GregorianCalendar.HOUR_OF_DAY), calendar.get(GregorianCalendar.MINUTE));

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime londonTime = zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime halfHourAhead = londonTime.plusMinutes(30);
        System.out.printf("Время через пол часа2: %s:%s%n", halfHourAhead.getHour(), halfHourAhead.getMinute());

    }
}
