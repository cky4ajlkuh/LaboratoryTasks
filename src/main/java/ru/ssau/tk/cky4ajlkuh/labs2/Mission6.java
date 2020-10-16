package ru.ssau.tk.cky4ajlkuh.labs2;

public class Mission6 {
    public static int[] array(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(i, 2);
        }
        return array;
    }
}
