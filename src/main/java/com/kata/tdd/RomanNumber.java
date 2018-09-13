package com.kata.tdd;

public class RomanNumber {
    public static String generate(int decimal) {
        String roman = "";
        if(decimal == 5){
            roman = "V";
            decimal -= 5;
        }
        for (int i = 0; i < decimal; ++i) {
            roman += "I";
        }
        return roman;
    }
}
