package itmo.lab4;

import java.util.Arrays;
import java.util.Random;

public class SortMerge {
    //метод который создает массив случайных чисел
    public int[] createRandomArray() {
        int[] randArr = new int[7];
        Random rand = new Random();
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = rand.nextInt(50);
        }
        return randArr;
    }

    //метод сортировки
    protected int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mind = arr.length / 2;
        int mind1 = arr.length - arr.length / 2;
        int[] left = new int[mind];
        int[] right = new int[mind1];
        System.arraycopy(arr, 0, left, 0, mind);
        System.arraycopy(arr, mind, right, 0, mind1);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    protected int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int n = left.length;
        int m = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                res[k] = left[i];
                i++;
            } else {
                res[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            res[k] = left[i];
            i++;
            k++;
        }
        while (j < m) {
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }


}
