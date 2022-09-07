package by.bsuir;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileLoad.loadFileAsString(new File("src/by/bsuir/model.obj"));

    }
}
