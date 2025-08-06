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

}
