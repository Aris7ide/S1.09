package com.models;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DaysTest {

    @ParameterizedTest
    @CsvSource ({"SUNDAY","SATURDAY"})
    void shouldBeWeekend(Days day) {
        assertThat(Days.checkDays(day)).isEqualTo(day + " is weekend");
    }

    @ParameterizedTest
    @CsvSource ({"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"})
    void shouldBeWeekday(Days day) {
        assertThat(Days.checkDays(day)).isEqualTo(day + " is weekday");
    }
}