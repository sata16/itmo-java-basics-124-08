package itmo.lab10;

import java.io.*;
import java.util.List;

public class JoinText {
    public static void joinTextFromFiles(List<String> str, File file, String path) {
        File file2 = new File(path);
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            String input;
            while ((input = reader.readLine()) != null) {
                for (String string : str) {
                    writer.write(input+" "+string +"\n");
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
