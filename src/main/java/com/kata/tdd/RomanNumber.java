package com.kata.tdd;

public class RomanNumber {
    public static String generate(int decimal) {
        if(decimal == 3){
            return "III";
        }
        if(decimal == 2){
            return "II";
        }
        return "I";
    }
}
