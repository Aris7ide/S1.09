import java.util.ArrayList;
import java.util.List;

public class ListPeople {

    List<Person> people;

    public ListPeople(List<Person> people) {
        this.people = people;
    }

    public List<Person> getMajors() {
        return people.stream().filter(p -> p.age() > 18).toList();
    }

}
