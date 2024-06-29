package itmo.lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadText {
    public static List<String> readText() {
        File file = new File("files/text.txt");
        List<String> str = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                str.add(input);
                //System.out.println(input);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return str;
    }


}
