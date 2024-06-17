package itmo.lab5;

import java.util.Arrays;

public class ReverseWord {
    public static void printReverseWord(String text) {
        StringBuilder str = new StringBuilder(text);
        String[] words = str.reverse().toString().split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]).append(" ");
        }
//        System.out.println(str);
//        System.out.println(Arrays.toString(words));
        System.out.println(res);

    }

}
