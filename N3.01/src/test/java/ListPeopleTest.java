import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListPeopleTest {

    Person person1 = new Person("mario",13);
    Person person2 = new Person("john",22);
    Person person3 = new Person("Ale",46);
    ListPeople listPeople = new ListPeople(List.of(person1,person2,person3));

    @Test
    void shouldGiveOnlyMajors() {
        assertThat(listPeople.getMajors().size()).isEqualTo(2);
        assertThat(listPeople.getMajors()).contains(person2,person3);
    }

}