import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<LocalDateTime> dates;

    public Agenda() {
        this.dates = new ArrayList<>();
    }

    public void addDate(LocalDateTime date) {
        this.dates.add(date);
    }

    public List<LocalDateTime> getNextDate() {
        return this.dates.stream().filter(d -> d.isAfter(LocalDateTime.now())).toList();
    }

    public List<LocalDateTime> getDates() {
        return dates;
    }
}
