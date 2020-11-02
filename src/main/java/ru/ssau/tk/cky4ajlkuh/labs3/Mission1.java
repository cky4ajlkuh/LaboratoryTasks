package ru.ssau.tk.cky4ajlkuh.labs3;

public class Mission1 {
    static void outStr(String str){
        for (int i=0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    static void byteString(String string){
        byte[] array = string.getBytes();
        for (int i : array){
            System.out.println(i);

        }
    }
}
