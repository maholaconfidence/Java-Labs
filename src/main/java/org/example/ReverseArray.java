package org.example;

import java.util.Arrays;

public class ReverseArray {
    int[] originalNum;

    ReverseArray(int[]originalNum) {
        this.originalNum = originalNum;

    }


    void Reverse() {
        for (int i = 0; i < originalNum.length / 2; i++) {
            int temp = originalNum[i];
            originalNum[i] = originalNum[originalNum.length - 1 - i];
            originalNum[originalNum.length - 1 - i] = temp;

        }

        System.out.println("Array in reverse:" + Arrays.toString(originalNum));

    }
}
