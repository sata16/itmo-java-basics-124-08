package itmo.lab4;

public class UniqueNumber {
    public static void uniqueArrayElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
