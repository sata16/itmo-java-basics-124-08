package itmo.lab5;

import static itmo.lab5.CountString.countOfSubstrings;
import static itmo.lab5.Palindrome.isPalindrome;
import static itmo.lab5.ReplaceWord.replaceWord;
import static itmo.lab5.ReverseWord.printReverseWord;

public class Main {
    public static void main(String[] args){
        //1
        LongestWord longestWord = new LongestWord();
        String text = "asdadsdadsda asasasd asdasd asdasda asdasdas dasdasd";
        System.out.println(longestWord.getLongestWord(text));
        //2
        String text1 = "А роза упала на лапу Азора";
        boolean res = isPalindrome(text1);
        System.out.println(res);
        //3
        String text3 = "Тучи бяка, дождь Бяка, метель БЯКА, а вот солнце и море небяка";
        replaceWord(text3);
        //4
        String t = "Мама мыла раму, мама мыла раму, мама мыла раму";
        String t2 = "Мама мыла";
        System.out.println(countOfSubstrings(t,t2));
        //5
        String test = "This is a test string";
        printReverseWord(test);
    }
}
