package com.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TaskTest {

    @Test
    void shouldBeLow() {
        Task task = new Task("Buy milk", Levels.LOW);
        assertThat(task.getLevel().toString()).isEqualTo("LOW");
    }

    @Test
    void shouldBeHigh() {
        Task task = new Task("Buy milk",Levels.HIGH);
        assertThat(task.getLevel().toString()).isEqualTo("HIGH");
    }

}