package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumOfSubtractAndDivision(double first, double second) {
        return subtract(first, second) + devide(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtract(first, second) + devide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы вычитания и деления: " + sumOfSubtractAndDivision(20, 15));
        System.out.println("Результат суммы всех операций равен: " + sumAllOperations(10, 15));
    }

}
