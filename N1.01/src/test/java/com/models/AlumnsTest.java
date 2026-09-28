package com.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AlumnsTest {

    @Test
    void shouldBeYellow () {
        Alumns alumn = new Alumns("Rosa",23,"JAVA",8.9,Levels.MEDIUM);
        assertThat(alumn.getColor()).isEqualTo("Yellow");
    }

    @Test
    void shouldBeRed () {
        Alumns alumn = new Alumns("Rosa",23,"JAVA",8.9,Levels.LOW);
        assertThat(alumn.getColor()).isEqualTo("Red");
    }

    @Test
    void shouldThrowException () {
        assertThatThrownBy(() -> Alumns.getEnum("A")).isInstanceOf(IllegalArgumentException.class);
    }
}