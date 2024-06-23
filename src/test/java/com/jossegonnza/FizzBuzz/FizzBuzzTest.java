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

    @Test
    void multiple_of_five_it_will_return_the_word_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(5)).isEqualTo("Buzz");
        Assertions.assertThat(fizzBuzz.calculate(10)).isEqualTo("Buzz");
        Assertions.assertThat(fizzBuzz.calculate(20)).isEqualTo("Buzz");
    }

    @Test
    void multiple_of_three_and_five_it_will_return_the_word_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(15)).isEqualTo("FizzBuzz");
        Assertions.assertThat(fizzBuzz.calculate(30)).isEqualTo("FizzBuzz");
        Assertions.assertThat(fizzBuzz.calculate(45)).isEqualTo("FizzBuzz");
    }

    @Test
    void if_not_multiple_of_three_and_five_it_will_return_the_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(1)).isEqualTo("1");
        Assertions.assertThat(fizzBuzz.calculate(2)).isEqualTo("2");
        Assertions.assertThat(fizzBuzz.calculate(4)).isEqualTo("4");
    }
}