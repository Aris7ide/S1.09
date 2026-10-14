import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main(String[] args) {

        // First point
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        // Second point
        LocalDate localDateFirst = LocalDate.of(2026,9,20);
        LocalDate localDateLast = LocalDate.of(2025,9,20);

        Period period = Period.between(localDateFirst,localDateLast);

        System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());

        // Third point
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime localDateTime2 = localDateTime.plusDays(5)
                .minusHours(10)
                .plusMinutes(30);

        System.out.println(localDateTime2);

        // Fourth point
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("EEEE-yyyy-hh");
        System.out.println(now.format(f1));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("HH-mm-ss");
        System.out.println(now.format(f2));

        // Fifth point
        Methods methods = new Methods();
        System.out.println(methods.passedDate(LocalDate.of(2025,9,20)));


    }
}
