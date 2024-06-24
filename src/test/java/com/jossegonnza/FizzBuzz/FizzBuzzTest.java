package com.jossegonnza.FizzBuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void multiple_of_three_it_will_return_the_word_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(6)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.calculate(9)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.calculate(12)).isEqualTo("Fizz");
    }

    @Test
    void multiple_of_five_it_will_return_the_word_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(10)).isEqualTo("Buzz");
        Assertions.assertThat(fizzBuzz.calculate(20)).isEqualTo("Buzz");
        Assertions.assertThat(fizzBuzz.calculate(40)).isEqualTo("Buzz");
    }

    @Test
    void multiple_of_three_and_five_it_will_return_the_word_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(60)).isEqualTo("FizzBuzz");
    }

    @Test
    void if_not_multiple_of_three_and_five_it_will_return_the_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(1)).isEqualTo("1");
        Assertions.assertThat(fizzBuzz.calculate(2)).isEqualTo("2");
        Assertions.assertThat(fizzBuzz.calculate(4)).isEqualTo("4");
    }

    @Test
    void if_there_is_a_number_3_duplicate_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(3)).isEqualTo("FizzFizz");
        Assertions.assertThat(fizzBuzz.calculate(13)).isEqualTo("Fizz");
        Assertions.assertThat(fizzBuzz.calculate(23)).isEqualTo("Fizz");
    }

    @Test
    void if_there_is_a_number_5_duplicate_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertThat(fizzBuzz.calculate(5)).isEqualTo("BuzzBuzz");
        Assertions.assertThat(fizzBuzz.calculate(25)).isEqualTo("BuzzBuzz");
        Assertions.assertThat(fizzBuzz.calculate(50)).isEqualTo("BuzzBuzz");
    }

}