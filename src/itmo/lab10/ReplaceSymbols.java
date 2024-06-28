package itmo.lab10;

import java.io.*;

public class ReplaceSymbols {
    public static void replaceSymbolsNotLetters(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write("\n" + str.replaceAll("\\W", "\\$"));
                //System.out.println(str);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
