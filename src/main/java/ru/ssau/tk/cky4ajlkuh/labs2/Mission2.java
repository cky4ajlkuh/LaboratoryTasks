package ru.ssau.tk.cky4ajlkuh.labs2;

public class Mission2 {
    public static int[] array(int size) {
        int[] array = new int[size];
        array[0] = 2;
        array[size - 1] = 2;
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = 1;
        }
        return array;
    }
}
