package com.example;

public class ArrayElementsService {
    public int getElementDivisibleThree(int[] arr) {

        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3) == 0) {
                element++;
            }
        }
        return element;


    }

}

