package ru.nowandroid.calc;

/**
 * Created by nowandroid on 14.12.2017.
 */

public class CalcUtils {

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static float div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Div by zero error");
        } else {
            return a / b;
        }
    }
}
