package ru.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double rate = percent / 100;

        while (amount > 0) {
            amount += amount * rate - salary;
            year++;
        }
        return year;
    }
}
