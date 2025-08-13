package ru.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n > 0) {
            for (int i = result; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(1));
    }
}
