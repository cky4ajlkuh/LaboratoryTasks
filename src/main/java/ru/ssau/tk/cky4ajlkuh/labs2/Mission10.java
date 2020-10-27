package ru.ssau.tk.cky4ajlkuh.labs2;

public class Mission10 {
    public static double[] geometric(int size, int first, int denominator) {
        double[] geometric = new double[size];
        geometric[0] = first;
        for (int i = 1; i < geometric.length; i++) {
            geometric[i] = geometric[i - 1] * denominator;
        }
        return geometric;
    }

    public static double[] divider(int number) {
        double[] divider = new double[number];
        int j = 1;
        divider[0] = j;
        for (int i = 1; i < divider.length; i++) {
            j++;
            if (number % j == 0) {
                if (Math.sqrt(number) > j) {
                    divider[i] = j;
                }
            }
        }
        return divider;
    }

    static void oppositeArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];

        }
    }

    public static boolean checkAvailability(double number, double[] array) {
        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }

    public static boolean checkNull(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

}
