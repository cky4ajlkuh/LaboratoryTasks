package ru.ssau.tk.cky4ajlkuh.test4;

public class CloneClass implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class SecondCloneClass {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
