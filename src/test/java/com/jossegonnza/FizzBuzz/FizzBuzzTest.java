package com.jossegonnza.FizzBuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void multiple_of_three_it_will_return_the_word_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(3)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.calculate(6)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.calculate(9)).isEqualTo("Fizz");
    }
}