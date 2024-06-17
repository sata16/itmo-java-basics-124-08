package itmo.lab5;

public class ReplaceWord {
    public static void replaceWord(String text) {
        String res = text.toLowerCase().replace("бяка", "[вырезано цензурой]");
        System.out.println(res);
    }
}
