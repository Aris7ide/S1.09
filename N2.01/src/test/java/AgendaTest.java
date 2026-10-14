import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class AgendaTest {

    Agenda agenda = new Agenda();

    @Test
    void shouldAddDate() {
        agenda.addDate(LocalDateTime.of(2026,8,23,11,34));
        agenda.addDate(LocalDateTime.of(2025,2,23,23, 0));

        assertThat(agenda.getDates().size()).isEqualTo(2);
    }

     @Test
    void shouldGiveFutureDate() {
        agenda.addDate(LocalDateTime.of(2026,12,23,11,34));
        agenda.addDate(LocalDateTime.of(2025,2,23,23, 0));

        assertThat(agenda.getNextDate()).contains(LocalDateTime.of(2026,12,23,11,34));
     }

}