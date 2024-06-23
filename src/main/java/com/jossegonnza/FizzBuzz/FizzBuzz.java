package com.jossegonnza.FizzBuzz;

public class FizzBuzz {

    public String calculate(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

}
