package ru.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i : data) {
            if (data[i] == el) {
                rst = data[i];
            }
            return rst;
        }
        return rst;
    }
}
