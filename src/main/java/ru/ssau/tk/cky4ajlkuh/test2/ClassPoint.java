package ru.ssau.tk.cky4ajlkuh.test2;

public class ClassPoint {

    public double x;
    public double y;
    public double z;

    public ClassPoint() {

    }
    public ClassPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void points() {
        System.out.print(x);
        System.out.print(y);
        System.out.print(z);
        System.out.println(" ");
    }

}