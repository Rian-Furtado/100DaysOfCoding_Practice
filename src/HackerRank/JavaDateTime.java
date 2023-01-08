package HackerRank;

import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class JavaDateTime {

    public static void main(String[] args) {

        System.out.println( findDay(8,5,2015));

    }

    public static String findDay(int month, int day, int year){
       LocalDate date = LocalDate.of(year, month, day);
       String answer = String.valueOf(date.getDayOfWeek());



       return answer;
    }

}
