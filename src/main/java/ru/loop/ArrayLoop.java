package ru.loop;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 3;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
