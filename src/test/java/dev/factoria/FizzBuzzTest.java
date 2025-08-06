package dev.factoria;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void testCheckNumberIfDivisionBy3_ShouldReturnFizz() {

        int number = 3;
        String expected = "Fizz";

        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.checkNumber(number);

        assertThat(result, is(equalTo(expected)));
    }

    @Test
    void testCheckNumberIfDivisionBy5_ShouldReturnBuzz() {

        int number = 5;
        String expected = "Buzz";

        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.checkNumber(number);

        assertThat(result, is(equalTo(expected)));

    }

    @Test
    void testCheckNumberIfDivisionBy5and3_ShouldReturnFizzBuzz() {

        int number = 15;
        String expected = "FizzBuzz";

        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.checkNumber(number);

        assertThat(result, is(equalTo(expected)));

    }

    @Test
    void testCheckNumberIfNotDivisionBy5and3_ShouldReturnNumTypeString() {

        int number = 7;
        String expected = "7";

        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.checkNumber(number);

        assertThat(result, is(equalTo(expected)));

    }

    @Test
    void testCheckNumberIfNumberIncludeCharacter3_shouldReturnFizz() {

        int number = 532;
        String expected = "Fizz";

        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.checkNumber(number);

        assertThat(result, is(equalTo(expected)));
    }

}
