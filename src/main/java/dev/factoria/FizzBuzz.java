package dev.factoria;

public class FizzBuzz {

    public String checkNumber(int num) {

        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }

        return null;
    }

}
