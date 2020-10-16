package ru.ssau.tk.cky4ajlkuh.labs2;

public class Mission7 {
    public static double[] quadraticEquation(double a, double b, double c) {
        if (a != 0 & b != 0 & c != 0) {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                if (x1 > x2) {
                    return new double[]{x2, x1};
                } else {
                    return new double[]{x1, x2};
                }
            }
            if (discriminant < 0) {
                return new double[0];
            }
            if (discriminant == 0) {
                double x = -b / (2 * a);
                return new double[]{x};
            }
        }
        if (c == 0) {
            double x1 = 0;
            double x2 = -b / a;
            if (x1 > x2) {
                return new double[]{x2, x1};
            } else {
                return new double[]{x1, x2};
            }
        }
        if (b == 0 & c < 0) {
            double x1 = Math.sqrt(-c / a);
            double x2 = -x1;
            if (x1 > x2) {
                return new double[]{x2, x1};
            } else {
                return new double[]{x1, x2};
            }
        }
        if (a == 0) {
            double x = -c / b;
            return new double[]{x};
        }

        return new double[0];
    }
}
