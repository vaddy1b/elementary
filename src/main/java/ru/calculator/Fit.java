package ru.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightOfMan = 187;
        short heightOfWoman = 176;
        double man = Fit.manWeight(heightOfMan);
        double woman = Fit.womanWeight(heightOfWoman);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 176 is " + woman);
    }

}
