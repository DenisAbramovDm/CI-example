package es.javaLearning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AppTest {
    @Test
    void multiplicationTest() {
        assertThat(App.multiplication(5)).isEqualTo(500);
    }
}