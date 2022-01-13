package com.codegym;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz == 0 && isBuzz == 0)
            return "FizzBuzz";

        if (isFizz == 0)
            return "Fizz";

        if (isBuzz == 0)
            return "Buzz";

        return number + "";
    }
}
