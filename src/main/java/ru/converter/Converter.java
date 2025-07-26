package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl1 = value / 100;
        return rsl1;
    }

    public static float rubleToDollar(float value) {
        float rsl2 = value / 90;
        return rsl2;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140f);
        float dollar = Converter.rubleToDollar(300f);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("300 rubles are " + dollar + " dollar.");
    }

}
