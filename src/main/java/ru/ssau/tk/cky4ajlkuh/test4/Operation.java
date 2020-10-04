package ru.ssau.tk.cky4ajlkuh.test4;

public abstract class Operation {

    abstract double apply(double number);

    double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
