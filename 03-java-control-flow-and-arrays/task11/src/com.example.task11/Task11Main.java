package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        
    }

    static void swap(int[] arr) {
        if(arr == null || arr.length == 0) return;
        int temp = arr[0];
        int indexToSwitch = numMin(arr);
        arr[0] = arr[indexToSwitch];
        arr[indexToSwitch] = temp;
        
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