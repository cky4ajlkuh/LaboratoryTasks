package ru.ssau.tk.cky4ajlkuh.test5;

public class IntGeneratorImpl implements  IntGenerator{
    private int count = 0;
    @Override
    public int nextInt() {
        return count++;
    }
}
