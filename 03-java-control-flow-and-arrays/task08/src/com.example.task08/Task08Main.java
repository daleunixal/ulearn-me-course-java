package com.example.task08;

import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {
       
    }

    static long mult(int[] arr) {
       
        return Arrays.stream(arr).asLongStream().reduce((x, y) -> x*y).orElse(0);
    }

}