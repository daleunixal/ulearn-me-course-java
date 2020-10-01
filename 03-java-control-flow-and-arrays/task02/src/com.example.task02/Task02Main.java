package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        
    }

    static String getSeason(int monthNumber) {
        if(monthNumber < 3 || monthNumber == 12) return "зима";
        if(monthNumber < 6) return "весна";
        if(monthNumber < 9) return "лето";
        return "осень";
    }
}