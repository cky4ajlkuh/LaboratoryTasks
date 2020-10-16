package ru.ssau.tk.cky4ajlkuh.labs2;

public class Mission5 {
    public static int Fib(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fib(n - 1) + Fib(n - 2);
    }

    public static int[] array(int n) {
        int[] array = new int[n];
        for (int i = 2; i != array.length; i++) {
            array[i] = Fib(i);
        }
        return array;
    }
}
