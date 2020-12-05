package ru.ssau.tk.cky4ajlkuh.test3;

public class task_1_19 {

    public static void printType(byte test) {
        System.out.println("byte");
    }

    public static void printType(short test) {
        System.out.println("short");
    }

    public static void printType(char test) {
        System.out.println("char");
    }

    public static void printType(int test) {
        System.out.println("int");
    }

    public static void printType(long test) {
        System.out.println("long");
    }

    public static void printType(double test) {
        System.out.println("double");
    }

    public static void printType(float test) {
        System.out.println("float");
    }

    public static void printType(boolean test) {
        System.out.println("boolean");
    }

    public static void printType(Object test) {
        if (test == null) {
            System.out.println("null");
        }
        System.out.println("Object");
    }
}
