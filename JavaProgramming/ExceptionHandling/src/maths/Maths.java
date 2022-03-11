package maths;

import exceptions.ExceptionOperations;

public class Maths {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0){
            throw new ExceptionOperations("Division by Zero");
        }
        return dividend/divisor;
    }
}
