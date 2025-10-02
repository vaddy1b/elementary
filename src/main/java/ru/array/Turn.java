package ru.array;

public class Turn {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int[] back(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int oppositeIndex = arr.length - 1 - i;
            int temp = arr[i];
            arr[i] = arr[oppositeIndex];
            arr[oppositeIndex] = temp;
        }
        return arr;
    }
}
