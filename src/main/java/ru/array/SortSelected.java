package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int lastIndex = data.length - 1;
        for (int i = 0; i < data.length; i++) {
            int minElement = MinDiapason.findMin(data, i, lastIndex);
            int minElementIndex = FindLoop.indexInRange(data, minElement, i, lastIndex);
            data = SwitchArray.swap(data, i, minElementIndex);
        }
        return data;
    }

    public static void main(String[] args) {
        sort(new int[]{1, 5, 3});
    }
}
