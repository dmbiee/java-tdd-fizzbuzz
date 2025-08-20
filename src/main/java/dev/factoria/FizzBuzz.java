package dev.factoria;

public class FizzBuzz {

    public String checkNumber(int num) {

        String numTypeString = String.valueOf(num);

        boolean isContains3 = numTypeString.contains("3");
        boolean isContains5 = numTypeString.contains("5");

        boolean isDivisionBy3 = num % 3 == 0;
        boolean isDivisionBy5 = num % 5 == 0;

        if (isDivisionBy3 && isDivisionBy5) {
            return "FizzBuzz";
        }
        if (isDivisionBy3 || isContains3) {
            return "Fizz";
        }
        if (isDivisionBy5 || isContains5) {
            return "Buzz";
        }
        return numTypeString;
    }

}
