package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i);
        }
    }

    static void swap(int[] arr, int firstInd) {
        int temp = arr[firstInd];
        int indexToSwitch = numMin(arr, firstInd);
        arr[firstInd] = arr[indexToSwitch];
        arr[indexToSwitch] = temp;
    }

    static int numMin(int[] arr, int index) {
        int value = Integer.MAX_VALUE;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] <= value) {
                value = arr[i];
                index = i;
            }
        }
        return index;
    }
}