import java.time.LocalDate;

public class Methods {

    public String passedDate(LocalDate localDate) {
        return localDate.isBefore(LocalDate.now()) ? "It is passed" : "it is not passed";
    }

}
