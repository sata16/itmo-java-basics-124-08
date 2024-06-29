package itmo.lab10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteString {
    public static void writeString(String strings, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            if (strings != null && !strings.trim().isEmpty()) {
                writer.write(strings);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }


}


