import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    void shouldLaunchException() {
        assertThatThrownBy(() -> new Person("Aris",-5)).isInstanceOf(IllegalArgumentException.class);
    }

}