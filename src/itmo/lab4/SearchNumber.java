package itmo.lab4;

public class SearchNumber {
    public static Boolean isSearchNumberArray(int[] searchNumber) {
        for (int i = 0; i < searchNumber.length; i++) {
            if (searchNumber[i] == 1 || searchNumber[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
