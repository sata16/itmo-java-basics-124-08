package itmo.lab4;

public class SortRise {
    public static String sortRiseArray(int[] sortNumber) {
        boolean flag = true;
        for (int i = 0; i < sortNumber.length - 1; i++) {
            if (sortNumber[i] > sortNumber[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return "OK";
        } else {
            return "Please, try again";
        }

    }
}
