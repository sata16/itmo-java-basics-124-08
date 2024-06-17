package itmo.lab4;

public class CompareNumber {
    public static Boolean isCompareOfThreeNumbers(int first, int second, int third) {
        if (third > second && second > first) {
            return true;
        } else {
            return false;
        }
    }
}
