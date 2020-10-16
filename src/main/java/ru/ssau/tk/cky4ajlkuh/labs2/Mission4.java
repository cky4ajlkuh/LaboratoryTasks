package ru.ssau.tk.cky4ajlkuh.labs2;

public class Mission4 {
    public static int[] array(int size) {
        int fullSize = 2 * size;
        int[] array = new int[fullSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = fullSize;
            fullSize -= 2;
        }
        return array;
    }
}
