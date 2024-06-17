package itmo.lab4;

import java.util.Arrays;

public class SwapElementsArray {
    public static void swapElements(int[] arr1) {
        System.out.println("Array 1: " + Arrays.toString(arr1));
        int temp = arr1[0];
        arr1[0] = arr1[arr1.length - 1];
        arr1[arr1.length - 1] = temp;
        System.out.println("Array 2: " + Arrays.toString(arr1));

    }
}
