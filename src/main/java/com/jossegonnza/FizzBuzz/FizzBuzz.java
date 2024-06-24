package com.jossegonnza.FizzBuzz;

public class FizzBuzz {


    public String calculate(int number) {
    StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }
        if (containsNum3(number)) {
            result.append("Fizz");
        }
        if (result.length() > 0) {
            return result.toString();
        }

        return String.valueOf(number);
    }

    private Boolean containsNum3(int number) {
        return String.valueOf(number).contains("3");
    }
}
