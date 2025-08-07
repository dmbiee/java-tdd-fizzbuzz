package dev.factoria;

public class FizzBuzz {

    public String checkNumber(int num) {

        String numTypeString = String.valueOf(num);

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0 || numTypeString.contains("3")) {
            return "Fizz";
        } else if (num % 5 == 0 || numTypeString.contains("5")) {
            return "Buzz";
        } else {
            return Integer.toString(num);
        }

    }

}
