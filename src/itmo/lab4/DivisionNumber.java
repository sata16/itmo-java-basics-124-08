package itmo.lab4;

import java.util.Arrays;

public class DivisionNumber {
    public static void printDivision(int[] number) {
        System.out.print("Деление на 3 и 5: ");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 3 == 0 && number[i] % 5 == 0) {
                System.out.print(number[i] + " ");
            }
        }
        System.out.print("\nДеление на 3: ");

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 3 == 0) {
                System.out.print(number[i] + " ");
            }
        }
        System.out.print("\nДеление на 5: ");

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 5 == 0) {
                System.out.print(number[i] + " ");
            }
        }


    }

    //ниже решение избыточное


//        int resultArr1 = 0; //Количество элементов в массиве
//        int resultArr2 = 0;
//        int resultArr3 = 0;
//        int[] tempArr1 = new int[number.length];//временный массив размером исходного
//        int[] tempArr2 = new int[number.length];
//        int[] tempArr3 = new int[number.length];
//        if (number.length != 0) {
//            for (int i = 0; i < number.length; i++) {
//                if (number[i] % 3 == 0 && number[i] % 5 == 0) { //перебираю по условию
//                    tempArr1[resultArr1] = number[i]; //записываю во временный массив
//                    resultArr1++;
//                } else if (number[i] % 3 == 0) {
//                    tempArr2[resultArr2] = number[i];
//                    resultArr2++;
//                } else if (number[i] % 5 == 0) {
//                    tempArr3[resultArr3] = number[i];
//                    resultArr3++;
//                }
//            }
//            int[] divByDifferent = Arrays.copyOf(tempArr1, resultArr1); // создаю результирующий массив нужного размера
//            int[] divByThree = Arrays.copyOf(tempArr2, resultArr2);
//            int[] divByFive = Arrays.copyOf(tempArr3, resultArr3);
//
//            //  System.out.println("Деление на 3: " + Arrays.toString(divByThree));
//            //вывод на экран результата
//            System.out.print("Деление на 3 и 5: ");
//            for (int i = 0; i < divByDifferent.length; i++) {
//                System.out.print(divByDifferent[i]);
//                if (i < divByDifferent.length - 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.print("\nДеление на 3: ");
//            for (int i = 0; i < divByThree.length; i++) {
//                System.out.print(divByThree[i]);
//                if (i < divByThree.length - 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.print("\nДеление на 5: ");
//            for (int i = 0; i < divByFive.length; i++) {
//                System.out.print(divByFive[i]);
//                if (i < divByFive.length - 1) {
//                    System.out.print(", ");
//                }
//            }
//
//        }
//


}
