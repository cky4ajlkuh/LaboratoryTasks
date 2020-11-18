package ru.ssau.tk.cky4ajlkuh.labs2;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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

    public static double evenNumber(double[] array) {
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static Integer maxNumber(int[] array) {
        if (array.length == 0) {
            return null;
        }
        int max = array[0];
        for (int i = 0; i != array.length; i++) {
            max = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[i]) {
                    max = array[j];
                }
            }
        }
        return max;
    }

    public static double sumNumber(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean comparisonOfDivision(double[] array) {
        double count1 = 0;
        double count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % array[0] == 0) {
                count1++;
            }
            if (array[i] % array[array.length - 1] == 0) {
                count2++;
            }
        }
        if (count1 > count2) {
            return true;
        } else {
            return false;
        }
    }

    public static double searchElement(double[] array, int number) {
        double k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                k = i;
            }
        }
        return k;
    }

    static void replayElements(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                indexMax = i;
            }
            if (array[i] == min) {
                indexMin = i;
            }
        }
        array[indexMax] = min;
        array[indexMin] = max;
    }

    static void bitwiseNegation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    static boolean[] trueArray(int[] array) {
        boolean[] secondArray = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                secondArray[i] = true;
            }
            if (array[i] % 2 != 0) {
                secondArray[i] = false;
            }
        }
        return secondArray;
    }

    static double multiplyArray(double[] array) {
        double multiply = 1;
        for (double i : array) {
            if (i != 0) {
                if (!Double.isInfinite(i)) {
                    if (!Double.isNaN(i)) {
                        multiply *= i;
                    }
                }
            }
        }
        return multiply;
    }

    static void outStringArray(String[] array) {
        for (String str : array) {
            System.out.println(str);
        }
    }

}

class outArray {
    public static void main(String[] args) {
        String[] array = new String[]{"Hello", "world", "hello", "World"};
        String[] array1 = new String[]{"Сижу", "дома", "болею"};
        String[] array2 = new String[]{"Миша", "Коля", "Никита", "Даниил"};

        Mission10.outStringArray(array);
        Mission10.outStringArray(array1);
        Mission10.outStringArray(array2);
    }
}

class outCod {
    public static void main(String[] args) {
        System.out.println(java.nio.charset.Charset.defaultCharset());
    }
}
