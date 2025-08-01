package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 1.4f;
        float expectedDollar = 1.5555556f;

        float outDollar = Converter.rubleToDollar(in);
        float outEuro = Converter.rubleToEuro(in);
        boolean passedRubleToDollar = expectedDollar == outDollar;
        boolean passedRubleToEuro = expectedEuro == outEuro;

        System.out.println("140 rubles are 1.4 euros. Test result : " + passedRubleToEuro);
        System.out.println("140 rubles are 1.5555556 dollars. Test result : " + passedRubleToDollar);

    }

}
