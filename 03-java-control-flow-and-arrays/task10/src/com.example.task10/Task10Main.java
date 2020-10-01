package com.example.task10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task10Main {
    public static void main(String[] args) {
        
    }

    static int numMin(int[] arr) {
        
        int index = 0;
        int value = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]<=value){
                value = arr[i];
                index = i;
            }
        }
        return index;
    }
}

