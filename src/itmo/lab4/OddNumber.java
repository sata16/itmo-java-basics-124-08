package itmo.lab4;

public class OddNumber {
    public static void printOddNumber(int[] number) {
        for (int num : number) {
            if (num % 2 != 0) {
                System.out.println(num);
            } else {
                continue;
            }

        }

    }

}
