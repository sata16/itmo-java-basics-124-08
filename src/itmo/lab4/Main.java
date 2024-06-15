package itmo.lab4;

import java.util.Arrays;
import java.util.Scanner;

import static itmo.lab4.CheckNumberArray.isCheckNumberInArray;
import static itmo.lab4.CheckNumberArray.printCheckedArray;
import static itmo.lab4.CompareNumber.isCompareOfThreeNumbers;
import static itmo.lab4.DivisionNumber.printDivision;
import static itmo.lab4.OddNumber.printOddNumber;
import static itmo.lab4.SearchNumber.isSearchNumberArray;
import static itmo.lab4.SortRise.sortRiseArray;
import static itmo.lab4.SummaNumber.isSumOfTwoNumbers;
import static itmo.lab4.SwapElementsArray.swapElements;
import static itmo.lab4.UniqueNumber.uniqueArrayElement;

public class Main {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 15, 30, 55, 65, 99, 45, 9, 9, 13, 4, 255, 8, 40};
        int[] arr = {3, -3, 7, 4, 5, 4, 3};//для метода isCheckNumberInArray  (задание 5)
        int[] searchNumber = {5, 9, 1, 4, 3};//для метода isSearchNumberArray (задание 6)
        int[] sortNumber = {5, 9, 10, 14, 30};//для метода sortRiseArray (задание 1.1)
        int[] arr1 = {5, 6, 7, 2}; //для метода swapElements(задание 1.3)
        int[] arr2 = {1, 2, 3, 1, 2, 4}; //для метода uniqueArrayElement(задание 1.4)
        //1
        printOddNumber(number);
        //2
        printDivision(number);
        //3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        System.out.println("Введите третье число");
        int third = scanner.nextInt();
        boolean res = isSumOfTwoNumbers(first, second, third);
        System.out.println("Результат: " + res);
        //4
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int one = sc.nextInt();
        System.out.println("Введите второе число");
        int two = sc.nextInt();
        System.out.println("Введите третье число");
        int three = sc.nextInt();
        boolean result = isCompareOfThreeNumbers(one, two, three);
        System.out.println("Результат: " + result);
        //5
        boolean check = isCheckNumberInArray(arr);
        printCheckedArray(arr);
        System.out.println("\n" + check);
        //6
        boolean search = isSearchNumberArray(searchNumber);
        System.out.println("Число 1 или 3 в массиве: " + search);
        //1.1
        String sortRes = sortRiseArray(sortNumber);
        System.out.println(sortRes);
        //1.2
        ScanArray scanArray = new ScanArray();
        scanArray.createArray();
        //1.3
        swapElements(arr1);
        //1.4
        uniqueArrayElement(arr2);
        //1.5
        SortMerge sortMerge = new SortMerge();
        int[] sortArr = sortMerge.createRandomArray();
        System.out.println("\n" + Arrays.toString(sortArr));
        int[] arr24 = sortMerge.mergeSort(sortArr);
        System.out.println(Arrays.toString(arr24));
    }


}
