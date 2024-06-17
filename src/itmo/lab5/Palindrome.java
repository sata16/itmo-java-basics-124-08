package itmo.lab5;

import java.util.Arrays;

public class Palindrome {
    public static Boolean isPalindrome(String text) {
        String temp = text.replace(" ", ""); //Убираем пробелы
       // System.out.println(temp);
        String strReverse = new StringBuilder(temp).reverse().toString();
       // System.out.println(strReverse);
        return temp.equalsIgnoreCase(strReverse);

        //Первый вариант решения = избыточное решение

//        char[] arr1 = temp.toCharArray(); //получаем массив символов
//        char[] arr2 = new char[arr1.length];// массив для сравнения и вывода
//        int k = 0; // элемент массива, для заполнения
//        int a = arr1.length - 1;
//        int b = arr1.length;
//        while (k < b) {
//            arr2[k] = arr1[a];
//            k++;
//            a--;
//        }
//        System.out.println("arr1 " + Arrays.toString(arr1));
//        System.out.println("arr2 " + Arrays.toString(arr2));
//        String res = new String(arr2);
    }
}
