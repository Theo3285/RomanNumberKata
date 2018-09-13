package com.kata.tdd;

public class RomanNumber {
    public static String generate(int decimal) {
        String roman = "";
        for (int i = 0; i < decimal; ++i) {
            roman += "I";
        }
        return roman;
    }
}
