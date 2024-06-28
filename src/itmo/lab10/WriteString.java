package itmo.lab10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteString {
    public static File writeString(String strings, String path) {
        File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            if (strings != null && !strings.trim().isEmpty()) {
                writer.write(strings);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return file;

    }

}
