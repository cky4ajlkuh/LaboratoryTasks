package ru.ssau.tk.cky4ajlkuh.labs2;

public class Mission8 {
    public static double[] integers(int size) {
        double[] integers = new double[size];
        int count = 1;
        for (int i = 0; i < integers.length; i++) {
            if (count % 3 == 0) {
                count++;
            }
            integers[i] = count;
            count++;
        }
        return integers;
    }

}
