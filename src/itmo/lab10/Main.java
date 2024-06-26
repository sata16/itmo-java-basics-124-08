package itmo.lab10;

import java.io.File;
import java.util.List;

import static itmo.lab10.JoinText.joinTextFromFiles;
import static itmo.lab10.ReadText.readText;
import static itmo.lab10.ReplaceSymbols.replaceSymbolsNotLetters;
import static itmo.lab10.WriteString.writeString;

public class Main {
    public static void main(String[] args) {
        //1
        List<String> strings = readText();
        System.out.println(strings);
        //2
        String str = "Hello World! ";
       writeString(str,"files/output.txt");
        //3
        File file = new File("files/output.txt");
       joinTextFromFiles(strings,file,"files/join.txt");
        //4
        File newfile = new File("files/forReplace.txt");
       replaceSymbolsNotLetters(newfile);

    }
}
