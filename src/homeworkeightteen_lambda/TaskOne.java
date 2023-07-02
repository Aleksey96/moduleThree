package homeworkeightteen_lambda;

import oop.Student;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.stream.Stream;

public class TaskOne {
    public static void main(String[] args) {
        LeapYear leapYear = (year) -> {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год високосный");
            } else {
                System.out.println(year + " год невисокосный");
            }
        };
        int year = 1996;
        leapYear.isLeapYear(year);

        LocalDateTime localDateTimeOne = LocalDateTime.of(1996, 5, 7, 0, 0);
        LocalDateTime localDateTimeTwo = LocalDateTime.now();

        DifferenceBetweenDate differenceBetweenDate = (localDateOne, localDateTwo) ->
                Duration.between(localDateTimeOne, localDateTimeTwo).toDays();
        System.out.println("Количество дней между " + localDateTimeOne + " и " + localDateTimeTwo + " составляет "
                + differenceBetweenDate.differenceBetweenDate(localDateTimeOne, localDateTimeTwo));

        FullWeeks fullWeeks = (localDateOne, localDateTwo) ->
                Duration.between(localDateTimeOne, localDateTimeTwo).toDays() / 7;
        System.out.println("Количество полных недель между " + localDateTimeOne + " и " + localDateTimeTwo + " составляет "
                + fullWeeks.showFullWeeks(localDateTimeOne, localDateTimeTwo));

        LocalDate localDate = LocalDate.of(1996,5,7);

        DayOfWeekByDate dayOfWeekByDate = (date) -> {
            DayOfWeek day = date.getDayOfWeek();
            return day.getDisplayName(TextStyle.FULL, new Locale("ru"));
        };
        System.out.println(localDate+" это "+dayOfWeekByDate.showDayOfWeekByDate(localDate));




        //Stream.of("Andy","Mike").map(Student::new).forEach(student -> System.out.println(student.getName()));
    }
}
