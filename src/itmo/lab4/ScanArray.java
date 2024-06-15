package itmo.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class ScanArray {
    public void createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array length: " + length + "\nNumbers of array:");
        for (int num : array) {
            System.out.println(num);
        }
        System.out.println(" Result: " + Arrays.toString(array));
    }

}

