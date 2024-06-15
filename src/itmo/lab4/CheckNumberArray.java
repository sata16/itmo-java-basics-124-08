package itmo.lab4;

public class CheckNumberArray {
    public static Boolean isCheckNumberInArray(int[] arr) {
        if (arr.length >= 2) {
            int firstNumber = arr[0];
            int lastNumber = arr[arr.length - 1];
            if (firstNumber == 3 || lastNumber == 3) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void printCheckedArray(int[] arr) {
        System.out.print("\narray ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
