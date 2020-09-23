package ru.ssau.tk.cky4ajlkuh.test3;

public final class Points {
    private Points() {

    }

    public static Point sum(Point a, Point b) {
        return new Point(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
    }

    public static Point subtract(Point a, Point b) {
        return new Point(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
    }

    public static Point multiply(Point a, Point b) {
        return new Point(a.getX() * b.getX(), a.getY() * b.getY(), a.getZ() * b.getZ());
    }

    public static Point divide(Point a, Point b) {
        return new Point(a.getX() / b.getX(), a.getY() / b.getY(), a.getZ() / b.getZ());
    }
    public static Point enlarge(Point thirdPoint, double permanent){
        return new Point(thirdPoint.getX() * permanent, thirdPoint.getY() * permanent, thirdPoint.getZ() * permanent);
    }
    public static double length(Point point) {
        return point.length();
    }
    public static Point opposite(Point point){
        return new Point(point.getX() * (-1), point.getY() * (-1), point.getZ() * (-1));
    }
    public static Point inverse(Point point){
        return new Point( 1 / point.getX(), 1 / point.getY(), 1 / point.getZ());
    }
    public static double scalarProduct(Point a, Point b) {
        return (a.getX()*b.getX() + a.getY()* b.getY() + a.getZ()* b.getZ()); }
    public static Point vectorProduct(Point a, Point b) {
        return new Point ( Math.pow(a.getX(), 2) - Math.pow(b.getX(), 2),Math.pow(a.getY(), 2) - Math.pow(b.getY(), 2) ,Math.pow(a.getZ(), 2) - Math.pow(b.getZ(), 2) );
    }
}