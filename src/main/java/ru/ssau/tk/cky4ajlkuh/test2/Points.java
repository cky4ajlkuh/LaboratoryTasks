package ru.ssau.tk.cky4ajlkuh.test2;

public class Points {

    Points points = new Points();

    public static ClassPoint sum (ClassPoint point1, ClassPoint point2) {
        return new ClassPoint( point1.x + point2.x, point1.y+ point2.y, point1.z + point2.z);
    }

    public static ClassPoint subtract (ClassPoint point1, ClassPoint point2){
        return new ClassPoint(point2.x - point1.x, point2.y - point1.y, point2.z - point1.z);
    }
    //multiply(), divide()

    public static ClassPoint multiply(ClassPoint point1, ClassPoint point2){
        return new ClassPoint(point2.x * point1.x, point2.y * point1.y, point2.z * point1.z);
    }

    public static ClassPoint divide(ClassPoint point1, ClassPoint point2){
        return new ClassPoint(point2.x / point1.x, point2.y / point1.y, point2.z / point1.z);
    }
}
