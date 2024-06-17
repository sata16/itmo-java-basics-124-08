package itmo.lab5;

public class CountString {
    public static int countOfSubstrings(String text, String text1) {
        int res = (text.length() - text.toLowerCase().replace(text1.toLowerCase(), "").length()) / text1.length();
        return res;
    }
}
