package by.bsuir;

import by.bsuir.components.Component;
import by.bsuir.components.Vertex;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileLoad {
    private static final Parser parser  = new Parser();
    public static void loadFileAsString(File file) throws IOException {
        FileWriter writer = new FileWriter("src/by/bsuir/file.txt", false);
        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(file);
            sc = new Scanner(inputStream, StandardCharsets.UTF_8);
            while (sc.hasNextLine()) {
                String line = sc.nextLine()+"\n";
                Component c = parser.parseLine(line);
                if(c == null)
                    continue;
                System.out.println(c);
                writer.write(c.toString());

            }
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
            writer.close();
        }
    }

}
