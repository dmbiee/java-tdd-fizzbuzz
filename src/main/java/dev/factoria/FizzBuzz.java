package dev.factoria;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FizzBuzz {

    public String checkNumber(int num) {

        String numTypeString = String.valueOf(num);

        Pattern patternFor3 = Pattern.compile("3");
        Pattern patternFor5 = Pattern.compile("5");

        Matcher matcherFor3 = patternFor3.matcher(numTypeString);
        Matcher matcherFor5 = patternFor5.matcher(numTypeString);

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0 || matcherFor3.find()) {
            return "Fizz";
        } else if (num % 5 == 0 || matcherFor5.find()) {
            return "Buzz";
        } else {
            return Integer.toString(num);
        }

    }

}
