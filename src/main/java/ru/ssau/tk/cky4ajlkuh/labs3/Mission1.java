package ru.ssau.tk.cky4ajlkuh.labs3;

public class Mission1 {
    static void outStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    static void byteString(String string) {
        byte[] array = string.getBytes();
        for (int i : array) {
            System.out.println(i);

        }
    }

    static void comparisonString() {
        String str1 = "Hello";
        String str2 = new String(str1);
        boolean comparison = false;
        if (str1 == str2) {
            comparison = true;
        }
        System.out.println(comparison);
        System.out.println(str1.equals(str2));
    }

    static boolean palindromeString(String string) {
        boolean palindrome = false;
        for (int i = 0; i < string.length(); i++) {
            for (int j = string.length() - 1; j != i; j--) {
                if (string.charAt(i) == string.charAt(j)) {
                    palindrome = true;
                }
            }
        }
        return palindrome;
    }
}
