package ru.ssau.tk.cky4ajlkuh.labs3;

import java.nio.charset.Charset;
import java.util.Objects;
import java.nio.charset.StandardCharsets.*;

public class Mission1 {

    static String returnByteStr(String str, Charset obj1, Charset obj2){
        return new String(str.getBytes(obj1), obj2);
    }

    static double entryStr(String string, String string2){
        return string.indexOf(string2);
    }

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
        String str2 = new String (str1);
        boolean comparison = false;
        if (str1.equals(str2)) {
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
                    break;
                }
            }
        }
        return palindrome;
    }

    static boolean comparisonIgnoredCaseString(String str1, String str2) {
        boolean comparison = false;
        if (!Objects.equals(null, str1) && !Objects.equals(null, str2)) {
            if (!str1.equals(str2) && str1.equalsIgnoreCase(str2)) {
                comparison = true;
            }
        }
        return comparison;
    }

    static double checkEntry(String string1, String string2) {
        return string1.indexOf(string2, string1.length() / 2);
    }

    static double newArrayString(String[] array, String prefix, String postfix) {
        double count = 0;
        for (String string : array) {
            if (string.startsWith(prefix) && string.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
    static String unification(String[] array){
        return String.join(", ", array);
    }
}

class test{
    public static void main(String[] args){
        Charset charset = Charset.defaultCharset();
        Charset charset2 = Charset.defaultCharset();
        System.out.println(Mission1.returnByteStr("Miha", charset, charset2));
    }
}
