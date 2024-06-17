package itmo.lab5;

public class ReplaceWord {
    public static void replaceWord(String text,String word,String wordOfReplace) {
        String res = text.toLowerCase().replace(word, wordOfReplace);
        System.out.println(res);
    }
}
