package chapter3;
import java.time.*; // import time classes

public class DateTimeLesson {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 11, 30);
        System.out.println(date1);
        System.out.println(date2);
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30,9000);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println(dateTime1);
        //LocalDate plus or minus - Years,Months,Weeks,Days
        System.out.println(date1.plusYears(0).plusDays(90).minusDays(2).minusWeeks(1));
        //LocaTime plus or minus - Hours, Minutes,Seconds,Nanos
        System.out.println(time1.plusHours(90));
        //LocalDateTime - plus or minus - Years,Months,Weeks,Days,Hours, Minutes,Seconds,Nanos 
    }   

}
