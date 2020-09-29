package ru.ssau.tk.cky4ajlkuh.test3;

public abstract class Operation {

    public abstract double apply(double number);

    public double applyTriple(double number){
        return apply(apply(apply(number)));
    }
}
