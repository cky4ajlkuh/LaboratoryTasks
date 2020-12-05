package ru.ssau.tk.cky4ajlkuh.test3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task_1_19Test {

    @Test
    public void testPrintType() {
        task_1_19.printType(1);
        task_1_19.printType(false);
        task_1_19.printType(1.);
        task_1_19.printType(1L);
        task_1_19.printType(1f);
        task_1_19.printType('K');
        task_1_19.printType(null);
        task_1_19.printType(new Person("Daniil", "Jackson", 777));
        task_1_19.printType((short) 10);
        task_1_19.printType((byte) 1);
    }

}